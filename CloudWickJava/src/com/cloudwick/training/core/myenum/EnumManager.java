package com.cloudwick.training.core.myenum;

public class EnumManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StateEnum.CA.getState());
		System.out.println(StateEnum.TX.getTemp());
		System.out.println(StateEnum.UT.cal());
		
		//shortcut -- 2nd way to access all at once using  'enhanced for loop'
		for (StateEnum e: StateEnum.values()){
			System.out.println(e.getState());
			System.out.println(e.getZip());
			System.out.println(e.getTemp());
		}
		
	}

}
