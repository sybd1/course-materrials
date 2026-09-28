import { create } from "zustand";

export const useCartStore = create((set) => ({
    items: [],

    addItem: (item) => set((state) => ({
        items: [...state.items, item],  // 불변성! (기존 배열을 직접 수정하면 안된다)
    })),

    removeItem: (id) => set((state) => ({
        items: state.items.filter((item) => item.id !== id)
    })),

    clearCart: () => set({items: []})
}));