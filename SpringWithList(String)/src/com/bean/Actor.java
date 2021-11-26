package com.bean;

import java.util.List;

public class Actor {
	private String name,address;
	private int age;
	private List<String> movies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getMovies() {
		return movies;
	}
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	public void display() {
		System.out.println("Actor Name : "+getName()+"\nAge : "+getAge()+"\nAddress : "+getAddress());
		System.out.println("Movies : ");
		List<String> l=getMovies();
		for(String m:l) {
			System.out.println(m);
		}
		
	}
}
