package com.cloudwick.training.core.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonAdvancedExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		UserJson obj = new UserJson();
		ObjectMapper mapper = new ObjectMapper();
		FileWriter writer =new FileWriter("User3.json");
		writer.write(mapper.writeValueAsString(obj));
		writer.flush();
		writer.close();
		
		
		UserJson obj2=mapper.readValue(new File("User2.json"), UserJson.class);
		System.out.println("office:"+obj2.name);
		System.out.println("home"+obj2.age);
	}

}
