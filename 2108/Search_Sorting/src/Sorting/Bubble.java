package Sorting;

import Searching.Linear;

public class Bubble {
	
	
	public void bubble()
	{
		
		int arr[]= {1,3,23,12,2123,12,122};
		int i,j,temp;
		int s=arr.length;
		
		for(i=0;i<s-1;i++)
		{
			
			for(j=0;j<s-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for(i=0;i<s;i++)
		{
		System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args)
	{
		Bubble bu=new Bubble();
		bu.bubble();
	}


}
