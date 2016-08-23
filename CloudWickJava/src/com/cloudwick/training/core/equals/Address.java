package com.cloudwick.training.core.equals;

public class Address {

	
	public String name;
	public int zip;
	
	@Override 
	public boolean equals (Object o){
		if (o == null){
			return false;
		}
		
		if (!(o instanceof Address)){
			return false;
		}
		
		Address add = (Address)o;
		return this.name == add.name && this.zip == add.zip;
		
	}
	
	@Override 
	public int hashCode(){
		int hash=77;
		hash += this.zip;
		hash+=(this.name==null?0:this.name.hashCode());
		return hash;
	}
	
}
