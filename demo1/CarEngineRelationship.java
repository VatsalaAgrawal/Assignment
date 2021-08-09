package com.techment.demo1;
class Engine{
	int engineId;
	int engineType;
	public Engine(int engineId, int engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	
}
class Car{
	String name;
	String model;
	Engine engine;
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	void displayCarDetails()
	{
		System.out.println("Name ="+name);
		System.out.println("Model ="+model);
		System.out.println("EngineID ="+ engine.engineId);
		System.out.println("EngineType ="+ engine.engineType);
		
		
	}
	
}

public class CarEngineRelationship {

	public static void main(String[] args) {
		Engine e=new Engine(101,4);
		Car c=new Car("Vatsala","BM2021",e);
		c.displayCarDetails();
		
		

	}

}
