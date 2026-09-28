'use client'

import { useUserStore } from "@/store/useUserStore";
import { useEffect } from "react";

export default function AsyncPage() {
    const { user, loading, fetchUser } = useUserStore();

    useEffect(() => {
        fetchUser();
    }, [fetchUser]);

    if (loading) return <h1>데이터 로딩중...</h1>;

    return (
        <>
            <h1>서버 데이터와  Zustand 연동 (비동기)</h1>
            {user ? (
                <div>
                    <h3>이름: {user.name}</h3>
                    <p>이메일: {user.email}</p>
                </div>
            ) : (
                <p>유저 정보가 없습니다.</p>
            )}

            <button onClick={() => fetchUser()}>데이터 다시 불러오기</button>
        </>
    )
}