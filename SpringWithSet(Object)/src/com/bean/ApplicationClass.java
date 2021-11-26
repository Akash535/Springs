package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClass {

	public static void main(String[] args) {
		try {
			//create obj of IOC container---ApplicationContext
			ApplicationContext a=new ClassPathXmlApplicationContext("spring.xml");
			
			
			Cricket tri=(Cricket)a.getBean("ct");
			tri.display();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
