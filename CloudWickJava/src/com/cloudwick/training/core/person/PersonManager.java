package com.cloudwick.training.core.person;

/**Class is person related
 * @author Janki
 * @since 20thJuly 2016 
 * @version 1.0
 */

public class PersonManager extends PersonAbstract{
	
	public String name;
	public static String city;
	public PersonManager(String name){
		this.name=name;
	}
	
	public PersonManager(){
		
	}
	/* @param
	 * @return
	 * 
	 */

	public void printResult(){
		System.out.println("Hello from person");
	}

	@Override
	public int getnumber(int i) {
		// TODO Auto-generated method stub
		return 36;
	}
}


