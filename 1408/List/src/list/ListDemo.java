package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	public static void main(String args[]){  
		 //Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Asmit");  
		 list.add("Sudeep");  
		 list.add("Shreya");  
		 list.add("Aishwarya");
		 list.add("Gayatri");
		 list.add("Siddhi"); 
		 list.add("Anushika");
		 list.add("Anjali"); 
		 
		 list.remove("Shreya");
		 int a=list.size();
		 list.remove(a-1);
		 
		 
		 
//		 for(String fruit:list)  
//		  System.out.println(fruit);  
		 
//		 Iterator mylt=list.iterator();
//		 while(mylt.hasNext())
//		 System.out.println(mylt.next());
		 
		 
		 for(int s=0;s<list.size();s++)
			 System.out.println(list.get(s));
			 
		  
		}  
	
	

}
