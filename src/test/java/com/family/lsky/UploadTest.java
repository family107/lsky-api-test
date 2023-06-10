package com.family.lsky;

import com.family.lsky.modul.BaseMessage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ClassName UploadTest
 * @Date 2023-06-10 10:23
 * @AUTHOR family
 **/
@SpringBootTest
public class UploadTest {

    @Resource
    private BaseMessage baseMessage;

    @Test
    public void testProfile() {
        System.out.println(baseMessage.toString());
    }
}
