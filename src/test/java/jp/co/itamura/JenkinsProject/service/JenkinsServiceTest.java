package jp.co.itamura.JenkinsProject.service;

import jp.co.itamura.JenkinsProject.dto.JenkinsDto;
import jp.co.itamura.JenkinsProject.service.impl.JenkinsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;

@SpringBootTest
public class JenkinsServiceTest {

    @Autowired
    JenkinsService service;

    @Test
    void テストメソッド引数1() {

        JenkinsDto expected = new JenkinsDto();
        expected.setName("板村 亮平");
        expected.setBirthyear(1982);
        expected.setAddress("山口");
        expected.setStudentflg(false);

        JenkinsDto actual = service.testMethod(1);
        assertThat(expected,is(actual));
    }

}