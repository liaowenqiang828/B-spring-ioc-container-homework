package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringIocContainerApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoSpringIocContainerApplication.class);

		GreetingController greetingController = context.getBean(GreetingController.class);
		greetingController.getGreetingService().sayHi();
		greetingController.getGreetingService().sayHi();
	}

}
