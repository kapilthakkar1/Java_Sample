package com.cloudwick.training.core.person;

public class AdminPerson extends PersonManager implements IPerson, IAdmin {

	public void printData(){
		System.out.println("print from admin");
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	public int cal(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}
	
	public int cal(int n1){
	return n1-10;
	}
}


