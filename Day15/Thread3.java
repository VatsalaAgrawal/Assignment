package com.techment.Day15;
class Water{
	synchronized public void drinkWater(int time) {
		for(int i=1;i<=time;i++) {
			System.out.println(Thread.currentThread().getName() +"is drinking water"+ i+" times");
		}
	}
}
class WaterBottle extends Thread{
	Water water=new Water();
	@Override
	public void run() {
		water.drinkWater(5);
}

}
public class Thread3  {

	public static void main(String[] args) {
		WaterBottle  waterbottle=new WaterBottle();
		Thread person1 =new Thread( waterbottle);
		Thread person2= new Thread( waterbottle);
		Thread person3 =new Thread( waterbottle);
		person1.setName("Vatsala");
		person2.setName("Rahul");
		person3.setName("Shivani");
		person1.start();
		person2.start();
		person3.start();
	}
		
	}

