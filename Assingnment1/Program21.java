package com.techment.Assingnment1;

import java.util.ArrayList;

class Product
{
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class Program21 {

	public static void main(String[] args) {
		ArrayList<Product> a=new ArrayList<Product>();
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
p1.setId(101);
p1.setName("Rahul");
p1.setPrice(120);
p2.setId(102);
p2.setName("Rajni");
p2.setPrice(890);
p3.setId(103);
p3.setName("kavya");
p3.setPrice(140);
a.add(p1);
a.add(p2);
a.add(p3);
for(Product p:a)
{
	System.out.println("ID = "+p.getId());
	System.out.println("NAME = "+p.getName());
	System.out.println("PRICE = "+p.getPrice());
	System.out.println();
}
		

	}

}
