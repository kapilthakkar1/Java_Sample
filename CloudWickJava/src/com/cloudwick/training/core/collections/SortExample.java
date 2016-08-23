package com.cloudwick.training.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args){
		
		List UserList =new ArrayList();
		UserList.add(new UserSort("Ashok", 24));
		UserList.add(new UserSort("Chetan", 11));
		UserList.add(new UserSort("Binesh", 36));
		printResult(UserList);
		
		
		Collections.sort(UserList);
		System.out.println("\nAfter Sorting\n");
		printResult(UserList);
	}
	

	 	private static void printResult(List value){
	 		for(Object o : value) {
	 			UserSort u = (UserSort) o;
	 			System.out.println(u.name + ","+ u.age );
	 		}
	 	}
}
