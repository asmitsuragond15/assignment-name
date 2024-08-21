package demo;

public class TestThread {
	
	public static void main(String[] args)
	{
		DemoThread T1=new DemoThread("Thread-3");
		T1.start();
		DemoThread T2=new DemoThread("Thread-3");
		T2.start();
	}

}
