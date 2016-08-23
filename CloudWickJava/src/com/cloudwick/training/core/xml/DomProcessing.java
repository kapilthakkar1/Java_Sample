package com.cloudwick.training.core.xml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomProcessing {
	
	private static Document doc;
	private static List<PersonXml> List = new ArrayList<>();
	

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
    parse("Person.xml");
    
	}
	
	private static void parse(String filename) throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder dom = fac.newDocumentBuilder();
		Document doc = dom.parse(filename);
		
	}
	
	private static void fetchData(){
		
     		//fetch root element
		   Element rootEl = doc.getDocumentElement();
		   //get list of person tags
		   NodeList personList= rootEl.getElementsByTagName("Person");
		   for(int i=0; i<personList.getLength();i++)
		   {
			   //fetch person Node
			   
			   Node Person = personList.item(i);
			   Element personEl = (Element) Person;
			   
			   
			   //Fetch personID
      int pid =Integer.parseInt(personEl.getAttribute("personId"));
      //fetch name value
      
      NodeList nameList = personEl.getElementsByTagName("name");
      Node name= nameList.item(0);
      Element nameEl = (Element) name;
      String nameVal = nameEl.getFirstChild().getNodeValue();
      
      
      //fetch age value
      
      NodeList ageList = personEl.getElementsByTagName("age");
      Node age= nameList.item(0);
      Element ageEl = (Element) age;
      String ageVal = nameEl.getFirstChild().getNodeValue();
      
      PersonXml obj=new PersonXml();
      obj.setAge(ageVal);
      obj.setName(nameVal);
      obj.setPersonId(pid);
      
      List.add(obj);
		   
		   }
	}
}
