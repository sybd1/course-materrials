package com.ohgiraffers.section03.layeredarchitecture;

import java.util.List;

public class MemoController {

    private final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    public List<MemoDTO> findMemos() {
        return memoService.selectMemos();
    }

    public MemoDTO createMemo(String content) {
        return memoService.registMemo(content);
    }
}
