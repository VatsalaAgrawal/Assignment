package com.techment.Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class WWE{
	private String firstName;
	private String lastName;
	private int weight;
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
	
}
public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		ArrayList<WWE> wwe = new ArrayList<WWE>();
		wwe.add(new WWE("Rahul","Singh",60));
		wwe.add(new WWE("Reshma","Sahu",45));
		wwe.add(new WWE("Ritiesh","Soni",80));
		wwe.add(new WWE("kavya","Mishra",40));
		wwe.add(new WWE("Aniket","Roshan",75));
		
		//Count of Wrestlers
		Long count = wwe.stream().count();
		System.out.println("Numbers Of Wrestlers : " + count);
		System.out.println();
		
		
		//Sum of weights of all Wrestlers
		Long WeightOfWrestlers =wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		System.out.println("Total sum of all weight of wrestlers :"+WeightOfWrestlers);
		System.out.println();
		
		//Return first name of all wrestlers
		System.out.println("First Name of Wrestlers :");
		List<String> list=wwe.stream().map(e->e.getFirstName()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println();
		
		
		//Minimum weight of Wrestlers
		WWEWrestlerImplementation e=new WWEWrestlerImplementation();
		Long minWeightofWrestlers=e.minimunWeight(wwe);
		System.out.println("Minimum weight of wrestlers :"+minWeightofWrestlers);
		
	}

		Long minimunWeight(ArrayList<WWE> wwe) {
		
		long minWeight =wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
				return minWeight;
	}

}
