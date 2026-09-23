'use client'

import MenuItem from "@/item/MenuItem";
import { searchMenu } from "@/lib/MenuAPI";
import { useSearchParams } from "next/navigation";
import { useState, useEffect, Suspense } from "react";

function MenuSearchResultContent() {

    const [menuList, setMenuList] = useState([]);

    // 쿼리 스트링 객체 가져오기
    const searchParam = useSearchParams();

    // '?menuName=열무' 에서 '열무'라는 값 추출
    const menuName = searchParam.get('menuName')
    console.log(menuName);

    useEffect(() => {
        setMenuList(searchMenu(menuName));
    }, [menuName]);

    return (
        <>
            <h1>검색 결과!!!!!!!!!!!</h1>
            <div>
                {menuList.map(menu => <MenuItem key={menu.menuCode} menu={menu}/>)}
            </div>
        </>
    )
}

export default function MenuSearchResult() {
    return (
        <Suspense fallback={<h1>검색 조건을 확인하는 중 입니다.</h1>}>
            <MenuSearchResultContent/>
        </Suspense>
    )
}
