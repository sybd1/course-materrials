'use client'

import { useState } from "react";
import Child from "./components/Child";
import { useStore } from "@/store/useStore";
import Parent from "./components/Parent";

export default function Home() {

  const { count } = useStore();

  return (
    <>
      <h1>Props Drilling</h1>
      <h2>page에서 보는 count: {count}</h2>
      <Parent/>
    </>
  );
}
