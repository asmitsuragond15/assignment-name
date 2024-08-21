package Mockito;

import org.junit.jupiter.api.Asseration;
import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.List;

public class PersonTest {
	
	public PersonService personservice;
	@Test
	public void testSort()
	{
		this.personservice=new PersonService();
		List<String> sortedNames=this.personservice.sort();
		System.out.println(sortedNames);
		Asseration.assertEquals(expeted"Asmit",sortedNames.get(2));
	}

}
