package com.ohgiraffers.section03.layeredarchitecture;

import java.util.List;

public class MemoService {

    private final MemoRepository memoRepository;

    /* 생성자 주입                     */
    public MemoService(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    public List<MemoDTO> selectMemos() {
        return memoRepository.findAll();
    }

    public MemoDTO registMemo(String content) {
        return memoRepository.save(content);
    }
}
