package com.bharath.SpringAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigRectangle {


	@Bean
	public Rectangle rectangle() {
		return new Rectangle(35,50);
	}

	@Bean(name = "RectanglePoint1")
	public RectanglePoint RectanglePoint1() {
		return new RectanglePoint(10,10);
	}

	@Bean(name = "RectanglePoint2")
	public RectanglePoint RectanglePoint2() {
		return new RectanglePoint(45,10);
	}

	@Bean(name = "RectanglePoint3")
	public RectanglePoint RectanglePoint3() {
		return new RectanglePoint(45,60);
	}

	@Bean(name = "RectanglePoint4")
	public RectanglePoint RectanglePoint4() {
		return new RectanglePoint(10,60);
	}

	@Bean(name = "list1")
	public List<String> strList() {
		return Arrays.asList("apple", "mango", "orange");
	}
	
	/*@Bean(name = "set1")
	public Set<String> strSet() {
		return Arrays.Set("apple", "mango", "orange");
	}*/
	
	

}