package com.cloudwick.training.core.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionExample.populateMap();
		CollectionExample.fetchMap();

	}

	public static Map<Integer, String> dataMap;
	
	private static void populateMap() {

	    //dataMap = new HashMap<>();
		
		dataMap = new ConcurrentHashMap<>();
		dataMap.put(1, "Fremont");
		dataMap.put(2, "fremont");
		dataMap.put(3, "Newark");
		dataMap.put(4, "Union City");

	}

	private static void fetchMap() {

		Set<Entry<Integer, String>> eset = dataMap.entrySet();
		Iterator<Entry<Integer, String>> eIterator = eset.iterator();

		while (eIterator.hasNext()) {
			Entry<Integer, String> e = eIterator.next();
			System.out.println("key:" + e.getKey());
			System.out.println("Value:" + e.getValue());
			dataMap.put(5, "Hayward");
		}

	}
}
