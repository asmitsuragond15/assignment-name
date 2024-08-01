package AssignmentDay4;
import java.util.*;

public class assignment4 {
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
	            System.out.println(numbers[i] + " ");
	        }
	        int[] num = new int[10]; 
	        
	        
	        for(int  i = 9 ; i >= 0 ; i--) {
	        	num[i] = numbers[9-i];
	        }
	        
	        System.out.println("Reverse are");
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.println(num[i] + " ");
	        }
	        
	        
	        
	        
	        
	    }
	}


