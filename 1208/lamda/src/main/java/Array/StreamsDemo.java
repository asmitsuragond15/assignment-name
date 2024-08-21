package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args)
	{
//		List<String> names=new ArrayList<String>();
//		names.add("Madhav");
//		names.add("Asmit");
//		names.add("Shraddha");
//		names.add("Karina");
//		for(String name:names)
//		System.out.print(name);
//	
//		names.stream().forEach(name->System.out.println(name));
//		names.stream().filter((n->n.startsWith("A"))).forEach(System.out::println);
//		names.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		 List<String> names=new ArrayList();
		 
		 names.add("Farid");
		 names.add("Hunter");
		 names.add("Stefan");
		 names.add("Justin");
		 names.add("Joseph");
		 
		 System.out.println("******* Enhanced For Loop ************");
		 for(String name:names)
		  System.out.println(name);
		 
		 System.out.println("********** For Each Method ****************");
		 //names.stream().forEach(name->System.out.println(name));
		 names.stream().forEach(System.out::println);
		 
		 System.out.println("************** Filter Opration ********************");
		 
		 names.stream().filter((n)->n.startsWith("J")).forEach(System.out::println);
		 
		 System.out.println("******** Map Operation ***********");
		 names.stream().map(String::toUpperCase).forEach(System.out::println);
		 
		 
		 List<String> namesUpperCase=names.stream().sorted().map(String::toUpperCase)
		         .collect(Collectors.toList());
		 
		 System.out.println(namesUpperCase);
	}

}



 