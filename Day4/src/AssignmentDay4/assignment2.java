package AssignmentDay4;
import java.util.*;

public class assignment2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10]; 
	        int key;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	       
	        System.out.println("The integers you entered are:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println("The integers to search in array list\n");
	        key=scanner.nextInt();
	        
	        for (int i = 0; i < 10; i++) {
	        	if(numbers[i]==key)
	        	{
	        		System.out.print("The entered number is in array list");	
	        	}
	        	else {
	        		System.out.print("The entered number is not in array list");
				}
	        }
	        
	        
	        
	    }
	}


