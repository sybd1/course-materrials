"use client";

import { useState } from "react";

const API_BASE_URL = process.env.NEXT_PUBLIC_API_BASE_URL;

export default function Home() {
  const [menus, setMenus] = useState([]);
  const [name, setName] = useState("");
  const [price, setPrice] = useState("");

  return (
    <main>
      <h1>메뉴 관리</h1>

      <ul>
        {menus.map((menu) => (
          <li key={menu.code}>
            {menu.name} - {menu.price.toLocaleString()}원
          </li>
        ))}
      </ul>

      <form>
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
