package com.Demo.Revision.SpringDIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDiDemoApplication.class, args);
		System.out.println("this is first change");
	//	ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml") {
		};
		AClass bean = (AClass) context.getBean(AClass.class);
		System.out.println(bean.id);
		context.close();
	}

}
