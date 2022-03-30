package com.study.jenkinspractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsPracticeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void successTest() {
    }

    @Test
    void failTest() {
        Assertions.assertThat(1).isEqualTo(2);
    }

    @Test
    void failTest2() {
        Assertions.assertThat(1).isEqualTo(2);
    }
}
