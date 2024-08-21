package list;

import java.util.HashMap;
import java.util.Set;


public class HashMapDemo {
	
	
	public static void main(String[] args)
	{
		
	HashMap<String,Integer> list=new HashMap<String,Integer>();   
	 
	 list.put("Asmit",120023);  
	 list.put("Sudeep",123);  
	 list.put("Shreya",1222);  
	 list.put("Aishwarya",12321);
	 list.put("Gayatri",43554);
	 list.put("Siddhi",5645); 
	 list.put("Anushika",12123);
	 list.put("Anjali",123324); 
	 System.out.println("This is HashMap");
	 System.out.println(list.get("Shreya"));
	 
	 Set<String> keys=list.keySet();
	 for(String key:keys)
		 System.out.println(key +" :" +list.get(key));

}
}