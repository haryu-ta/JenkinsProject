package jp.co.itamura.JenkinsProject.service;

import jp.co.itamura.JenkinsProject.JenkinsProjectApplication;
import jp.co.itamura.JenkinsProject.dto.JenkinsDto;
import jp.co.itamura.JenkinsProject.service.impl.JenkinsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JenkinsServiceTest {

    @Autowired
    private JenkinsService service;

    @Test
    public void テストメソッド引数1() {

        JenkinsDto expected = new JenkinsDto();
        expected.setName("板村 亮平");
        expected.setBirthyear(1982);
        expected.setAddress("山口");
        expected.setStudentflg(false);

        JenkinsDto actual = service.testMethod(1);
        assertThat(expected,is(actual));
    }

}