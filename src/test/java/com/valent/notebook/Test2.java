package com.valent.notebook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest 可以配合autowire进行bean的inject
@SpringBootTest
public class Test2 {

    @Autowired
    JellyService jellyService;

    @Test
    void fun1() {
        int res = jellyService.add(1, 1);
        Assertions.assertEquals(2, res);

    }
}
