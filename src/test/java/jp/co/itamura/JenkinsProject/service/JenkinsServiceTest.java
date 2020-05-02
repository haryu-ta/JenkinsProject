package jp.co.itamura.JenkinsProject.service;

import jp.co.itamura.JenkinsProject.JenkinsProjectApplication;
import jp.co.itamura.JenkinsProject.dto.JenkinsDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

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