package com.cloudwick.training.core.patterns.prototype;

public class CloneManager {
	
	public static void main(String[] args)
	{
		UserClone obj = new UserClone();
		obj.city="Fremont";
		System.out.println("First: "+obj.city);
		
		UserClone obj2=(UserClone) obj.clone();
		System.out.println("Second: "+obj2.city);
	}

}
