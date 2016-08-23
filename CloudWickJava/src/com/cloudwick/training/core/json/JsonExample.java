package com.cloudwick.training.core.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExample {

	
	
	
	public static void main(String[] args) throws IOException, ParseException
	{
	writeJsonData("kapil2.json");
	readJsonData("kapil2.json");
	}
	
	private static void writeJsonData(String fileName) throws IOException
	{
		JSONObject obj = new JSONObject();
		obj.put("name","KT");
		obj.put("age",new Integer(22));
		
		JSONObject obj2= new JSONObject();
		obj2.put("off","123");
		obj2.put("home","345");
		
		JSONArray arr = new JSONArray();
		arr.add(obj2);
		
		JSONObject obj3=new JSONObject();
		obj3.put("off","555");
		obj3.put("home","888");
		
		arr.add(obj3);
		
		obj.put("addresses",arr);
		
			FileWriter writer = new FileWriter(fileName);
			writer.write(obj.toJSONString());
			writer.flush();
			writer.close();
	}
	
	
	private static void readJsonData(String fileName) throws FileNotFoundException, IOException, ParseException{
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(fileName));
		JSONObject json = (JSONObject) obj;
		System.out.println("Name:"+json.get("name"));
		System.out.println("Age:"+json.get("age"));
		JSONArray arr=(JSONArray) json. get("addresses");
		Iterator<JSONObject> obj2=arr.iterator();
		while(obj2.hasNext()){
			JSONObject obj3=obj2.next();
			System.out.println("Off:"+obj3.get("off"));
			System.out.println("house:"+obj3.get("home"));
		}
		
	} 
	
}
