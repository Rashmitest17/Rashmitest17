package com.practice;

public class Runner  {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.horn();
		v.speed();
		Vehicle.engine();
		
		v = new Bike();
		v.horn();
		v.speed();
		Vehicle.engine();  
		
		
		/* 
		 * Static for only class ke liye hota hai ,individual instance ke liye nahi hota hai...
		 * jo ek common method hita hai vo har instanc use use kar rahe hote hai 
		 * 
		 * https://video.search.yahoo.com/search/video;_ylt=AwrOpvSRNZhkqoQeiZ_7w8QF;_ylu=c2VjA3NlYXJjaAR2dGlkAw--;_ylc=X1MDOTY3ODEzMDcEX3IDMgRmcgNtY2FmZWUEZnIyA3A6cyx2OnYsbTpzYixyZ246dG9wBGdwcmlkA2YuVkJPTFVTUnRhYUhQejJrZkV0RUEEbl9yc2x0AzAEbl9zdWdnAzAEb3JpZ2luA3ZpZGVvLnNlYXJjaC55YWhvby5jb20EcG9zAzAEcHFzdHIDBHBxc3RybAMwBHFzdHJsAzQ5BHF1ZXJ5A2phdmE4JTIwc3RhdGljJTIwYW5kJTIwZGVmYXVsdCUyMG1ldGhvZCUyMGV4YW1wbGVzJTIwaW4lMjBoaW5kaQR0X3N0bXADMTY4NzY5NzQyOA--?p=java8+static+and+default+method+examples+in+hindi&ei=UTF-8&fr2=p%3As%2Cv%3Av%2Cm%3Asb%2Crgn%3Atop&fr=mcafee&type=E210US91088G0#id=1&vid=de56c71504628edad0810f8cae80e6f9&action=view
		 * 
		 * default --- instance relate hota hai 
		 * 
		 */
		
		 	
	}
	
				
				
		
		
		
}
