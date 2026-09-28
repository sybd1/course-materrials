'use client';

import { useStore } from "@/store/useStore";

export default function GrandChild() {

    const { count, increase, decrease, text, setText } = useStore();

    return (
        <>
            <h2>GrandChild count: {count}</h2>
            <button onClick={increase}>+1</button>
            <button onClick={decrease}>-1</button>
            <hr/>

            <input
                value={text}
                onChange={(e) => setText(e.target.value)}
            />
            <p>{text}</p>
        </>
    )
}