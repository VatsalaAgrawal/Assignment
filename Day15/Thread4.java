package com.techment.Day15;

class Water1{
	synchronized public void drinkWater(int time) {
		synchronized (this) {
			
		
		for(int i=1;i<=time;i++) {
			System.out.println(Thread.currentThread().getName() +"is drinking water"+ i+" times");
		}
	}
		for(int i=1;i<=time;i++) {
			System.out.println(Thread.currentThread().getName() +"is eating"+ i+" times");
		}
	}
}
class WaterBottle1 extends Thread{
	Water1 water=new Water1();
	@Override
	public void run() {
		water.drinkWater(5);
}

}

public class Thread4 {

	public static void main(String[] args) {
		WaterBottle1  waterbottle=new WaterBottle1();
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
