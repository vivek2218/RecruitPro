package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jbk.service.UserService;

@SpringBootApplication
public class RecruitProApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitProApplication.class, args);
		System.out.println("app started..");
		
//		UserService bean = applicationContext.getBean(UserService.class , bean);
//		System.out.println(bean);
	}

}
