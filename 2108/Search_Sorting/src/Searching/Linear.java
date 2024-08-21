package Searching;

import java.util.Scanner;

public class Linear {
	
	public void linear()
	{
		int key,i,count=0;
		int arr[]= {1,3,23,12,2123,12,122};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key to Search=");
		key=sc.nextInt();
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("The key is founded in array that is " +key);
				return;
			}
			
		}
		
			System.out.println("The key is not founded in array");
				
		
	}
	
	
	public static void main(String[] args)
	{
		Linear li=new Linear();
		li.linear();
	}

}
