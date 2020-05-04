package jp.co.itamura.JenkinsProject;


import jp.co.itamura.JenkinsProject.dto.JenkinsDto;
import jp.co.itamura.JenkinsProject.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JenkinsProjectApplication {
// implements CommandLineRunner {

	@Autowired
	JenkinsService service;

//	public static void main(String[] args) {
//		SpringApplication.run(JenkinsProjectApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		JenkinsDto dto = service.testMethod(1);
//		System.out.println(dto.getBirthyear());
//	}


	public static void main(String[] args){
		try (ConfigurableApplicationContext ctx = SpringApplication.run(JenkinsProjectApplication.class, args)) {
			JenkinsProjectApplication app = ctx.getBean(JenkinsProjectApplication.class);
			app.run(args);
		}
	}

	public void run(String... args){
		JenkinsDto dto = service.testMethod(1);
		System.out.println(dto.getBirthyear());
	}
}
