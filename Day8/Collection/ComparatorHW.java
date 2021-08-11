package com.techment.Day8.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class  Product{
	int id;
	String name;
	int price;
	int quantity;
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
class QuantitySorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.quantity==o2.quantity)
			return 0;
		else if(o1.quantity>o2.quantity)
			return -1;
			else
				return 1;
		
	}
	
}
class PriceSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price==o2.price)
			return 0;
		else if(o1.price>o2.price)
			return -1;
			else
				return 1;
		
	}
	
}

 
public class ComparatorHW {

	public static void main(String[] args) {
		ArrayList<Product> a=new ArrayList<Product>();
		a.add(new Product(1,"Maggie",800,5));
		a.add(new Product(2,"Pasta",870,10));
		a.add(new Product(3,"Parle G",100,8));
		System.out.println("Display Records-");
		
		for(Product e:a)
		{
			System.out.println(e);
			
		}
		System.out.println("After Quantity Sorting-");
		Collections.sort(a,new QuantitySorting());
		for(Product e:a)
		{
			if(e.price>500)
			System.out.println(e);
			
		}
		System.out.println("After PRICE Sorting-");
		Collections.sort(a,new PriceSorting());
		for(Product e:a)
		{
			System.out.println(e);
			
		}


	}



	}


