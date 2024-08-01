package AssignmentDay4;
import java.util.*;

public class assignment7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10]; 
	        int min=numbers[0];
	        int max=numbers[0];
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	       
	        System.out.println("The integers you entered are:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(numbers[i] + " ");
	        }
	        
	        for (int i = 0; i < 10; i++) 
	        {
	        	if(numbers[i]<min)
	        	{
	        		min=numbers[i];
	        	}
	        	if(numbers[i]>max)
	        	{
	        		max=numbers[i];
	        	}
	        	
	        }
	        System.out.println("The largest number in array is" + max);
	        System.out.println("The smallest number in array is" + min);
	        
	        
	        
	        
	      
	        
	        
	        
	    }
	}


