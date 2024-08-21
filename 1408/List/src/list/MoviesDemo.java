package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MoviesDemo {
	

	public static void main(String args[]){  
		 //Creating a List  
//		 List<String> list=new ArrayList<String>();  
//		 //Adding elements in the List  
//		 list.add("Kalki");  
//		 list.add("KGF");  
//		 list.add("Puspha");  
//		 list.add("Marvel");
//		 list.add("Mission Impossible");
//	
//		 Collections.sort(list);
//		 
//		 	for(String a:list)
//		 		System.out.println(a);
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Kalki", 2019, 7.5));
        list.add(new Movie("KGF", 2018, 8.2));
        list.add(new Movie("Pushpa", 2021, 7.9));
        list.add(new Movie("Marvel", 2019, 8.5));
        list.add(new Movie("Mission Impossible", 2023, 8.0));

     
        System.out.println("Sorted by Title:");
        Collections.sort(list, Comparator.comparing(Movie::getTitle));
        list.forEach(System.out::println);
        
        System.out.println();
        
        
        System.out.println("Sorted by Year:");
        Collections.sort(list, Comparator.comparing(Movie::getReleaseYear));
        list.forEach(System.out::println);
        
        System.out.println();
        
        System.out.println("Sorted by Rating:");
        Collections.sort(list, Comparator.comparing(Movie::getRating));
        list.forEach(System.out::println);
//		 	
		 
	}

}
