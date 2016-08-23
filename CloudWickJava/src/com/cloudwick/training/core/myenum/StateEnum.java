package com.cloudwick.training.core.myenum;

public enum StateEnum {
       
	CA("California",94538,"4C"),
	TX("Texas",11111,"5C"),
	UT("Utah",45878,"9C");
	
	private  StateEnum(String state, int zip, String temp){
		this.state=state;
		this.zip=zip;
		this.temp=temp;
	}
	
	private int zip;
	private String state;
	private String temp;
	
	public int getZip() {
		return zip;
	}
	public String getState() {
		return state;
	}
	public String getTemp() {
		return temp;
	}
	
	public int cal(){
		return this.zip+10;
	}
}
