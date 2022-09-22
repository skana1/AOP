package com.exampleaop.Main;

import config.ProjectConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Main {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			HelloService service = c.getBean(HelloService.class);
			String message = service.hello("Estera");
			System.out.println("Result is " + message);
		}
	}

}
