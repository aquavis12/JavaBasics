package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class Encap{
	private String fname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	//-------------------------------------------------------------
	interface myinterface{
		public void myInterfaceMethod();
	}
	
	class hero implements myinterface{

		@Override
		public void myInterfaceMethod() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
	//------------------------------------------------------------------
	public static void main(String[] args) {
		Encap newObject = new Encap();
		newObject.setFname("Vishnu");
		System.out.println (newObject.getFname());
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Vishnu");
		arrList.add("Akshaya");
		
		Collections.sort(arrList);
		arrList.size();
		System.out.println(arrList.get(0));
		
		LinkedList <String> linkedList = new LinkedList<String>();
		linkedList.add("HI");
		linkedList.addFirst("Lol");
		
		System.out.println(linkedList);
	Level myVar = Level.MEDIUM;
	
	
	 try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    } finally {
	      System.out.println("The 'try catch' is finished.");
	    }
}



}

