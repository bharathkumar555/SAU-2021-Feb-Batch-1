package com.accolite.domain;

import java.util.ArrayList;

public class Order {

	private int orderId;
	private ArrayList<String> orders;
	private String name;




	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public ArrayList<String> getOrders() {
		return this.orders;
	}

	public void setOrders(ArrayList<String> orders) {
		this.orders = orders;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	


}
