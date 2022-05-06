package com.valent.notebook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;


@SpringBootTest
public class Test3 {


    // @MockBean打了这个annotation后，必须用Mockito.when来模拟数据，不然测试的方法的结果都是默认值
    // @SpyBean打了这个annotation后, 如果mock了数据，那么结果就按配置的来， 如果没有那么走原来的方法
    @SpyBean
    JellyService jellyService;

    @Test
    void fun1() {
        Mockito.when(jellyService.add(1, 1)).thenReturn(2);
        int res = jellyService.add(1, 1);
        Assertions.assertEquals(2, res);

        int res2 = jellyService.minus(5, 2);
        Assertions.assertEquals(3, res2);

    }
}
