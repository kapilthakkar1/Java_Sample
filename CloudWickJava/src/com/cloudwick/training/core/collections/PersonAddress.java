package com.cloudwick.training.core.collections;

public class PersonAddress {

	public String city;
	
	public PersonAddress(String c){
		city=c;
	}
	
	
	public boolean equals(Object o){
	PersonAddress p = (PersonAddress) o;
	return this.city.equals(p.city);
	}
	
	public int HashCode(){
		return this.city.hashCode();
	}
}
