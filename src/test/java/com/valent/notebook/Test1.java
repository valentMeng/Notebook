package com.valent.notebook;

import org.junit.jupiter.api.*;

public class Test1 {

    @BeforeAll
    static void startOnce() {
        System.out.println("init once");
    }

    @BeforeEach
    void start() {
        System.out.println("init");
    }

    @AfterEach
    void end() {
        System.out.println("end");
    }

    @Test
    void fun1() {
        int res = 1 + 1;
        Assertions.assertEquals(2, res);
        Assertions.assertTrue(true);
        Assertions.assertNull(null);
        System.out.println(123);
    }

    @Test
    void fun3() {
        int res = 1 + 1;
        Assertions.assertEquals(2, res);
        Assertions.assertTrue(true);
        Assertions.assertNull(null);
        System.out.println(1234);
    }

}
