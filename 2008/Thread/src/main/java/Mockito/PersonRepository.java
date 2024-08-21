package Mockito;

import java.util.Arrays;
import java.util.List;

public class PersonRepository  {
	
	public List<String> findAll()
	{
		System.out.println("Person Repository FindAll");
		return Arrays.asList("Asmit","Shraddha","Karina","Sakshi");
	}

}
