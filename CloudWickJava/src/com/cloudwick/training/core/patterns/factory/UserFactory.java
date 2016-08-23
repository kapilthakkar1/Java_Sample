package com.cloudwick.training.core.patterns.factory;

public class UserFactory {

	public static IUser getInstance(int type){
		IUser obj=null;
		
		if(type==111){
			obj=new AdminUser();
			}
			else if(type==222){
				obj=new GeneralUser();
			}
		
		return obj;
		}
	}

