"use client";

import {useState, useEffect} from "react";
// import process from "next/dist/build/webpack/loaders/resolve-url-loader/lib/postcss";

const API_BASE_URL = process.env.NEXT_PUBLIC_API_BASE_URL;

export default function Home() {
    const [menus, setMenus] = useState([]);
    const [name, setName] = useState("");
    const [price, setPrice] = useState("");
    const [error, setError] = useState("");
    const [isLoading, setIsLoading] = useState(true);

    useEffect(() => {
        async function loadMenus() {
            try {
                const response = await fetch(`${API_BASE_URL}/api/v1/menus`);

                if (!response.ok) {
                    throw new Error("메뉴를 불러오지 못했습니다.");
                }

                const data = await response.json();
                setMenus(data);
            } catch (error) {
                setError(error.message);
            } finally {
                setIsLoading(false);
            }
        }

        loadMenus();
    }, []);

    async function handleSubmit(event) {
        event.preventDefault(); // form 기본 새로고침 막기
        setError("");

        try {
            const response = await fetch(`${API_BASE_URL}/api/v1/menus`, {
                    method: "POST",
                    headers: {"Content-Type": "application/json"},
                    body: JSON.stringify({
                                                name: name,
                                                price: Number(price)
                                            }
                    )
                }
            );

            if (!response.ok) {
                throw new Error("메뉴를 등록하지 못했습니다.");
            }
            const createdMenu = await response.json();
            // 서버가 돌려준 새 메뉴를 기존 배열 뒤에 추가한 새 배열로 상태를 갱신한다.
            setMenus((currentMenus) => [...currentMenus, createdMenu])
            setName("");
            setPrice("");
        } catch (error) {
            setError(error.message);
        }
    }

    if (isLoading) return <p>메뉴를 불러오는 중입니다.</p>

    return (
        <main>
            <h1>메뉴 관리</h1>

            {/* error가 빈 문자열이 아닐 때만 오류 문장 렌더링 */}
            {error && <p>{error}</p>}

            <ul>
                {menus.map((menu) => (
                    <li key={menu.code}>
                        {menu.name} - {menu.price.toLocaleString()}원
                    </li>
                ))}
            </ul>

            <form onSubmit={handleSubmit}>
                <input
                    value={name}
                    onChange={(event) => setName(event.target.value)}
                    placeholder="메뉴명"
                    required
                />
                <input
                    type="number"
                    value={price}
                    onChange={(event) => setPrice(event.target.value)}
                    placeholder="가격"
                    min="0"
                    required
                />
                <button type="submit">등록</button>
            </form>
        </main>
    );
}
