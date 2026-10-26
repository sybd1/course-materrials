package com.ohgiraffers.section03.layeredarchitecture;

import java.util.ArrayList;
import java.util.List;

public class MemoryMemoRepository implements MemoRepository {

    private final List<MemoDTO> memos = new ArrayList<>();
    private int sequence = 1;

    public MemoryMemoRepository() {
        save("직접 객체를 만들고 연결하던 흐름 복습");
        save("Spring Container가 객체를 대신 조립");
    }

    @Override
    public List<MemoDTO> findAll() {
        return new ArrayList<>(memos);
    }

    @Override
    public MemoDTO save(String content) {
        MemoDTO memo = new MemoDTO(sequence++, content);
        memos.add(memo);
        return memo;
    }
}
