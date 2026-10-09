package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcServiceTest {
    private final CalcService service = new CalcService();

    @Test
    void testAdd() {
        // 1 + 2 が 3 になることを検証する
        int result = service.add(1, 2);
        assertEquals(3, result, "1 + 2 は 3 になるはずです");
    }
}
