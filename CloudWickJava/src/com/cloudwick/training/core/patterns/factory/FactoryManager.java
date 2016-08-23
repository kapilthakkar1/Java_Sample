package com.cloudwick.training.core.patterns.factory;

public class FactoryManager {
	
	public static void main(String[] args){
		IUser uobj1 = UserFactory.getInstance(111);
		uobj1.printResult();
		
		IUser uobj2 = UserFactory.getInstance(222);
		uobj2.printResult();
	}

}
