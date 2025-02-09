package com.example.AnnotationsEx.SpringBootAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
//		ApplicationContext context = new AnnotationConfigApplicationContext(COnfig.class);
//
//		College college = 	context.getBean("collegeBean",College.class);
//		college.Test();
//
//		Student student = context.getBean("student",Student.class);
//	  student.studentTest();

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
   		ctx.register(Employee.class);
        ctx.refresh();

		Employee employee = ctx.getBean(Employee.class);
		employee.displayinfo();
		ctx.close();
	}

}
