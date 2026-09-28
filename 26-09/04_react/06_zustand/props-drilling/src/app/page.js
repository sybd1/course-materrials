'use client'

import { useState } from "react";
import Child from "./components/Child";

export default function Home() {
  const [count, setCount] = useState(0);

  return (
    <>
      <h1>Props Drilling</h1>
      <h2>page에서 보는 count: {count}</h2>
      <Child count={count} setCount={setCount} />
      {/* 좌항의 count가 props에게 보내는 key, 우항의 count가 부모의 값 */}
    </>
  );
}
