'use client'

import { getMenubyMenuCode } from "@/lib/MenuAPI";
import { useParams } from "next/navigation";
import { useEffect, useState } from "react";

export default function MenuDetail() {
    const {menuCode} = useParams(); // /menu/? 동적인 값을 읽어옴

    const [menu, setMenu] = useState();

    useEffect(() => {
        setMenu(getMenubyMenuCode(menuCode))
    }, [menuCode])

    return (
        menu && 
        <>
            <h1>{menu.menuName} 상세 페이지!</h1>
            <h3>메뉴 가격: {menu.menuPrice}</h3>
            <h3>메뉴 종류: {menu.categoryName}</h3>
            <h3>메뉴 설명: {menu.detail.description}</h3>
            <img src={menu.detail.image} style={{maxWidth: 500}} alt={menu.menuName}/>
        </>
    )
}