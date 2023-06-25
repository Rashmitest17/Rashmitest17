package com.practice;

public interface Vehicle {

	
	public abstract  void horn();
	
	
	default   void speed() {
		System.out.println("Speed is best coomon for all classes ");
	}
	
	 static void engine() {
		System.out.println("Engin is coomon ");
	}
	
	
	
}



