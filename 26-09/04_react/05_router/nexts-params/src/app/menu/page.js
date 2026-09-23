'use client'

import MenuItem from "@/item/MenuItem";
import { getMenuList } from "@/lib/MenuAPI";
import { useRouter } from "next/navigation";
import { useEffect, useState } from "react";

export default function Menu() {

    const [menuList, setMenuList] = useState([]);
    const [searchValue, setSearchValue] = useState('');

    const router = useRouter();

    useEffect(() => {
        setMenuList(getMenuList());
    }, []);

    const onChangeHandler = (e) => {
        setSearchValue(e.target.value)
    }

    const onClickHandler = () => {
        router.push(`/menu/search?menuName=${searchValue}`);
    }

    return (
        <>
            <h1>메뉴 페이지 입니다</h1>
            <div>
                <input
                    type="search"
                    name="menuName"
                    value={searchValue}
                    onChange={onChangeHandler}
                />
                <button onClick={onClickHandler}>검색</button>
            </div>
            <div>
                {menuList.map(menu => <MenuItem key={menu.menuCode} menu={menu}/>)}
            </div>
        </>
    )
}