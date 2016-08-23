package com.cloudwick.training.core.equals;

public class EqualManager {
public static void main(String[] args) {
	// TODO Auto-generated method stub
Address addobj = new Address();
Address addobj2=new Address();

System.out.println("addobj: "+addobj);
System.out.println("addobj2: "+addobj2);
System.out.println(addobj==addobj2);
//System.out.println(addobj.equals(addobj2));

addobj.name="F";
addobj.zip=94536;
addobj2.name="F";
addobj2.zip=94536;

System.out.println(addobj.equals(addobj2));


}
}
