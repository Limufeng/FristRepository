package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.one.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		Product p = (Product) context.getBean("p");
		// c.setName("wanffff");
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
	}
}
