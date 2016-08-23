package com.cloudwick.training.core.immutable;

public final class UserImmutable {
	
	private int ssn;
	private String name;
	public UserImmutable(int s, String n){
		ssn=s;
		name=n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserImmutable obj = new UserImmutable(24,"sam");
	}

	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}


	
}
