package com.cloudwick.training.core.json;

import java.util.ArrayList;
import java.util.List;

public class UserJson {
	
	public String name = "Fremont";
	public int age=20;
    public List<AddressJSON> list = new ArrayList<AddressJSON>(){
    	{add(new AddressJSON ("123","400"));
    	add(new AddressJSON ("456","778"));
    	}
    
    };
}