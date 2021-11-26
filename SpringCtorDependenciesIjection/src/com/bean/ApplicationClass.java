package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClass {

	public static void main(String[] args) {
		try {
			//create obj of IOC container---ApplicationContext
			ApplicationContext a=new ClassPathXmlApplicationContext("triangle.xml");
			
			//Triangle tri=new Triangle(); -->o/p: 0,0,null
			//id of bean definition from xml file
			
			Triangle tri=(Triangle)a.getBean("t");//--> o/p: 3,5,Rectangle Triangle
			tri.display();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
