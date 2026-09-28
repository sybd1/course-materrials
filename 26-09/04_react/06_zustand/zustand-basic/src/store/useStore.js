import { create } from "zustand";

export const useStore = create((set) => ({
    count: 0,   // 데이터
    text: "",

    // set: zustand store에 저장된 상태를 변경하는 함수
    // state: 현재 store에 있는 데이터의 '스냅샷'
    increase: () => set((state) => ({count: state.count + 1})),  // 데이터를 조작하는 방법
    decrease: () => set((state) => ({count: state.count - 1})),
    
    setText: (value) => set({text: value})
}))