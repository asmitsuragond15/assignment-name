package Mockito;

public class PersonService {
	
	private PersonRepo repo;
	public PersonService()
	{
		this.repo=new PersonRepo();
	
	}
	public List<String> sort()
	{
		System.out.println("Person Service: sort()");
	}

}
