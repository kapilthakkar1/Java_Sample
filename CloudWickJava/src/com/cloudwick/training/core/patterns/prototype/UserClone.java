package com.cloudwick.training.core.patterns.prototype;

public class UserClone implements Cloneable {

	
	public String city;
	@Override
	public Object clone(){
		
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
