package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
	
	public static void main(String args[]){  
		 //Creating a List  
		 List<String> list=new LinkedList<String>();  
		 
		 list.add("Asmit");  
		 list.add("Sudeep");  
		 list.add("Shreya");  
		 list.add("Aishwarya");
		 list.add("Gayatri");
		 list.add("Siddhi"); 
		 list.add("Anushika");
		 list.add("Anjali"); 
		 
		 System.out.println("Before removing first and last" +list);
		 list.removeFirst();
		 System.out.println("After removing Last" +list);
		 list.removeLast();
		 System.out.println("After removing Last" +list);
		 list.remove("Shreya");
		 System.out.println("After removing Shreya" +list);
		 list.remove(0);
		 System.out.println("After removing index 0" +list);
		 
		 

		
			
			 
		  
		}  
	
	


}
