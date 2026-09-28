'use client'

import { useCartStore } from "@/store/useCartStore";
import { useUIStore } from "@/store/useUIStore";
import { useUserStore } from "@/store/useUserStore";

export default function Home() {
  const { isModalOpen, openModal, closeModal } = useUIStore();
  const { user, login, logout } = useUserStore();
  const { items, addItem } = useCartStore();

  return (
    <>
      {/* User 세션 */}
      <section>
        <h2>User: {user ? user.name : "로그인 전"}</h2>
        <button onClick={() => login({ name: '판됴' })}>로그인</button>
        <button onClick={logout}>로그아웃</button>
      </section>

      {/* Cart 세션 */}
      <section>
        <h2>장바구니 상품: {items.length}개</h2>
        <button onClick={() => addItem({ id: Date.now(), name: "새 상품" })}>상품 추가</button>
      </section>

      {/* UI 세션 */}
      <section>
        <button onClick={openModal}>모달 열기</button>
        {isModalOpen && (
          <div style={{ background: 'yellow', position: 'absolute' }}>
            <p>공지사항 모달입니다</p>
            <button onClick={closeModal}>닫기</button>
          </div>
        )}
      </section>
    </>
  );
}
