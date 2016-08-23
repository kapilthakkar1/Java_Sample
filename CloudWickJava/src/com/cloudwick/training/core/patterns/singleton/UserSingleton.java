package com.cloudwick.training.core.patterns.singleton;

public class UserSingleton {
	public static UserSingleton userObj;
	public String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	/*	UserSingleton obj = new UserSingleton();
		obj.name="Sam";
		System.out.println(obj.name);	
		obj.name="Dinesh";
		System.out.println(obj.name);
		UserSingleton obj2 = new UserSingleton();
		obj2.name="FG";   */
		
		UserSingleton uobj1 = UserSingleton.getInstance();
		uobj1.name="Fremont";
		System.out.println(uobj1.name);
		UserSingleton uobj2 = UserSingleton.getInstance();
		System.out.println(uobj2.name);	
	}
		private UserSingleton(){
		
	}
		public static UserSingleton getInstance(){
			if(userObj == null){
				userObj=new UserSingleton();
			}		
			return userObj;
		}
}
