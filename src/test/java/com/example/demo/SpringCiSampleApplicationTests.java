package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCiSampleApplicationTests {

	@Test
	void contextLoads() {
	    // わざと絶対に失敗する検証（アサーション）を書き足す
	    org.junit.jupiter.api.Assertions.fail("バグ混入テスト！");
	}

}
