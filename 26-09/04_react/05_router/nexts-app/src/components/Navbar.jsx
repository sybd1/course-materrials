'use client'

import Link from "next/link";
import { usePathname } from "next/navigation";

export default function Navbar() {

    const pathname = usePathname(); // 현재 경로 가져오기

    const isActive = (path) => pathname === path;

    const activeStyle = {
        backgroundColor: 'yellow',
        color: 'red'
    }
    return (
        <>
            <p>현재 주소: {pathname}</p>
            <ul>
                <li><Link href="/" style={isActive("/") ? activeStyle : undefined}>메인</Link></li>
                <li><Link href="/about" style={isActive("/about") ? activeStyle : undefined}>소개</Link></li>
                <li><Link href="/menu" style={isActive("/menu") ? activeStyle : undefined}>메뉴</Link></li>
            </ul>
        </>
    )
}