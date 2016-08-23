package com.cloudwick.training.core.user;
import com.cloudwick.training.core.person.AdminPerson;
import com.cloudwick.training.core.person.PersonManager;

public class UserManager {

	public int ssn;
	public int cal(int num1,int ssn){
	this.ssn=ssn;
	return ssn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Hello");
       // 'this' keyword can not be used in static resource
       
      UserManager userObj = new UserManager();
      int i = userObj.cal(24,36);
      System.out.println("Value:" +i);
      System.out.println(userObj.ssn);
      PersonManager personObj=new PersonManager();
      personObj.printResult();
      
      PersonManager.city="Fremont";
      System.out.println(personObj.city);
     
      
      personObj.city="newark";
      PersonManager personObj2=new PersonManager();
      System.out.println("city:" +personObj2.city);
      
      AdminPerson adminObj = new AdminPerson();
      adminObj.printResult();
      adminObj.printData();
      
      //AdminPerson adminObj3 = new PersonManager();
      
      PersonManager adminObj3 = new AdminPerson();
      
      adminObj3.printResult();
      System.out.println(adminObj3 instanceof AdminPerson);
      
      System.out.println(adminObj.cal(1, 2));
      System.out.println(adminObj.getAge());
      //IPerson u=new IPerson();
      
      System.out.println(adminObj.cal(36));
      
      System.out.println(personObj.getnumber(24));
      personObj.abstractPrint();
	}
}
