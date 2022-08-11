package com.practice;

import java.util.ArrayList;

public class Product {
	private int id;
	private String name;
	private int price;
	
	
	Product(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public ArrayList<Product> info(){
		
		ArrayList<Product> productlist=new ArrayList<>();
		productlist.add(new Product(id,name,price));
		
		return productlist;
	}

}
