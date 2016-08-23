package com.cloudwick.training.core.collections;



public class UserSort  implements Comparable<UserSort> {

	public String name;
	public int age;
	
	public UserSort(String n, int a){
		name=n;
		age=a;
	}

	@Override
	public int compareTo(UserSort u) {
		// TODO Auto-generated method stub
		
		//ascending order
		return this.age-u.age;
		
		//descending order
		//return u.age-this.age;
		
		//sorting through name
		//return this.name.compareTo(u.name);
		
	}	
	
}
