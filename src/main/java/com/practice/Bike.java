package com.practice;

public class Bike  implements Vehicle{

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		
		System.out.println("Bike-- POM POM ");
		
	}
	
	@Override
	public void speed() {
		System.out.println(" Overriden for Bike");
	}
	

	
	
}
