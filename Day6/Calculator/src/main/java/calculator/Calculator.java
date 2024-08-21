package calculator;
public class Calculator {

	
	public int sum(int a,int b)
	{
		
		return a+b;
		
	}
	
	
	public static void main(String[] args)
	{
		
		Calculator cal=new Calculator();
	
		System.out.println(cal.sum(10, 9));
	}
	
}
