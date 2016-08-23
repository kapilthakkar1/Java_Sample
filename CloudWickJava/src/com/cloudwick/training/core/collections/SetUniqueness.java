package com.cloudwick.training.core.collections;

import java.util.HashSet;
import java.util.Set;

public class SetUniqueness {
 public static void main(String[] args){
	 
	 Set<String> data = new HashSet<>();
	 
	 data.add("F");
	 data.add("G");
	 System.out.println(data.contains("F"));
	 Set<PersonAddress> pset=new HashSet<>();
	 pset.add(new PersonAddress("Fremont"));
	 pset.add(new PersonAddress("Newark"));
	 PersonAddress p = new PersonAddress("Fremont");
	 System.out.println(pset.contains(p));
	 
	 
	 
 }
}
