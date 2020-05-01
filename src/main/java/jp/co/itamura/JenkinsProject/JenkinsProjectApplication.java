package jp.co.itamura.JenkinsProject;

import jp.co.itamura.JenkinsProject.dto.JenkinsDto;
import jp.co.itamura.JenkinsProject.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication implements CommandLineRunner {

	@Autowired
	JenkinsService service;

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JenkinsDto dto = service.testMethod(1);
		System.out.println(dto.getBirthyear());
	}
}
