package com.techment.demo;
 class Employ2{
	private int id;
	private String name;
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
	
}
public class SetterGetter {

	public static void main(String[] args) {
		Employ2 e=new Employ2();
		e.setId(2);
		e.setName("Vatsala");
				System.out.println(e.getId());
				System.out.println(e.getName());
		
		

	}

}
