package com.bharath.SpringAssignment;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

public class Rectangle {
	
	@Autowired
	@Qualifier("list1")
	private List<String> newList;
	
	/*@Autowired
	@Qualifier("set1")
	private Set<String> newSet;*/

	private int height;
	private int width;

	@Autowired
	@Qualifier("RectanglePoint1")
	private RectanglePoint RectanglePoint1;

	@Autowired
	@Qualifier("RectanglePoint2")
	private RectanglePoint RectanglePoint2;

	@Autowired
	@Qualifier("RectanglePoint3")
	private RectanglePoint RectanglePoint3;

	@Autowired
	@Qualifier("RectanglePoint4")
	private RectanglePoint RectanglePoint4;

	
	
	

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}

	public void setRectanglePoint1(RectanglePoint RectanglePoint) {
		this.RectanglePoint1 = RectanglePoint;
	}


	public RectanglePoint getRectanglePoint1() {
		return RectanglePoint1;
	}

	public void setRectanglePoint2(RectanglePoint RectanglePoint) {

		this.RectanglePoint2 = RectanglePoint;
	}
	
	public RectanglePoint getRectanglePoint2() {
		return RectanglePoint2;
	}

	public void setRectanglePoint3(RectanglePoint RectanglePoint) {

		this.RectanglePoint3 = RectanglePoint;
	}
	
	public RectanglePoint getRectanglePoint3() {
		return RectanglePoint3;
	}

	public void setRectanglePoint4(RectanglePoint RectanglePoint) {
		this.RectanglePoint4 = RectanglePoint;
	}
	
	public RectanglePoint getRectanglePoint4() {
		return RectanglePoint4;
	}

	public void setNewList(List<String> newList) {
		this.newList = newList;
	}

	
	public void getNewList() {
		System.out.println("List of fruits: " + newList);
	}
	
	/*public void setNewSet(Set<String> newSet) {
		this.newSet = newSet;
	}

	
	public void getNewSet() {
		System.out.println("List of fruits: " + newSet);
	}*/

	
	public void draw() {
		System.out.println("Rectangle Dimensions :" );
		System.out.println("Height :"+ getHeight() + ", Width :" + getWidth());
		System.out.println("");
		System.out.println("Four RectanglePoints are:");
		System.out.println("RectanglePoint 1: " + RectanglePoint1.getX() + " , " + RectanglePoint1.getY());
		System.out.println("RectanglePoint 2: " + RectanglePoint2.getX() + " , " + RectanglePoint2.getY());
		System.out.println("RectanglePoint 3: " + RectanglePoint3.getX() + " , " + RectanglePoint3.getY());
		System.out.println("RectanglePoint 4: " + RectanglePoint4.getX() + " , " + RectanglePoint4.getY());
		getNewList();
		//getNewSet();
	}

}