package com.cloudwick.training.core.annotation;

public class UserAnnotation {

	@Monitor
	public void printResult(int i){
	System.out.println("First:"+i);
	
}
	
	public void printDate(int j){
		System.out.println("Second:"+j);
		
	}
	
}
