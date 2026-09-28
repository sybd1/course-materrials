'use client'

import { usePersistStore } from "@/store/usePersistStore";
import { useEffect, useState } from "react";

export default function PersistPage() {
    const { theme, toggleTheme } = usePersistStore();

    // Hydration 에러 해결 - 서버와 브라우저의 첫 렌더링 결과를 맞추기 위한 상태
    const [isMounted, setIsMounted] = useState(false);

    useEffect(() => {
        setIsMounted(true);
    }, []);

    if (!isMounted) return <div>로딩 중...</div>

    return (
        <div style={{ background: theme === "dark" ? "#333" : "#fff"}}>
            <p>현재 테마: {theme}</p>
            <button onClick={toggleTheme}>테마 변경</button>
        </div>
    )
}