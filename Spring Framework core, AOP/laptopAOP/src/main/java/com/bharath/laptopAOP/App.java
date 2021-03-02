package com.bharath.laptopAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import LaptopService.LaptopService;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LaptopService laptopService = (LaptopService) context.getBean("laptopService");
		laptopService.getLaptop().setCompanyName("Dell");
		System.out.println(laptopService.getLaptop().getCompanyName());
    }
}