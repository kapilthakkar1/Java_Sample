package com.cloudwick.training.core.collections;

import java.util.Comparator;

public class UserComparator implements Comparator<UserSort> {

	@Override
	public int compare(UserSort o1, UserSort o2) {
		// TODO Auto-generated method stub
		
		//sort by name
		return o1.name.compareTo(o2.name);
	}
	
}
