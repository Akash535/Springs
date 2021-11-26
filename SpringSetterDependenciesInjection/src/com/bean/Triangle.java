package com.bean;

public class Triangle {
	//properties of bean -- dependencies
	
	private int h,b;
	private String type;
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void display() {
		System.out.println("Height = "+getH()+"\nBase = "+getB()+"\nType = "+getType());
	}
}
