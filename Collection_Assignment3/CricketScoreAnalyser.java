package com.techment.Collection_Assignment3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyser{
private LinkedList<Integer> runData=new LinkedList<Integer>();


void addRunsToList(int runData){
	this.runData.add(runData);
}
void calRunRate(int score){
	int sum=0;
	double avg;
	for(int v:runData) {
		sum +=v;
		
	}
	avg=1.0f*sum/50;
System.out.println("Runrate is :"+avg);
}
void lowestRunsScored(int score)
{
	Integer min= Collections.min(runData);
	System.out.println("Minimim run="+min);
}
void RunList() {
	for(int i=0;i<runData.size();i++)
	{
		System.out.println("run"+(i+1)+" :"+runData.get(i));
	}

	
}
}


public class CricketScoreAnalyser {

	public static void main(String[] args) {
		ScoreAnalyser score=new ScoreAnalyser();
		System.out.println("Enter number you want to add run");
		Scanner sc=new Scanner(System.in);
		int players =sc.nextInt();
		System.out.println("enter runs");
		for(int i=0;i<players;i++)
		{
			score.addRunsToList(sc.nextInt());
		}
		
	
		score.calRunRate(players);
score.RunList();
		score.lowestRunsScored(players);
		

	}

}
