package com.bharath.SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		
		ApplicationContext c = new AnnotationConfigApplicationContext(ConfigRectangle.class);
		Rectangle rectangle = c.getBean(Rectangle.class);
		rectangle.draw();
		
	}
}