package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service 
public class CalcService {
    // 2つの数値を足すだけのシンプルなメソッド
    public int add(int a, int b) {
        return a + b;
    }
}
