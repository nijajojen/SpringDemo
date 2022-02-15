package com.example.demo.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		ApplicationContext appContext= new ClassPathXmlApplicationContext("beans.xml");
		User user= (User)appContext.getBean("user");
		*/
		/*conventional method link 2 class.
		User user= new User();
		user.setName("Nija");
		Address address= new Address();
		address.setAddr("usa");
		user.setAddress(address);
		*/
		
		//With spring above can be replaced as below:
		ApplicationContext appContext= new ClassPathXmlApplicationContext("beans.xml");
		User user= (User)appContext.getBean("user");
		/*System.out.println(user.getName()+ user.getAddress().getAddr());*/
		System.out.println(user.getName());
		
	}

}
