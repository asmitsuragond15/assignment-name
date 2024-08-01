package AssignmentDay4;
import java.util.*;

public class assignment1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10]; 
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	       
	        System.out.println("The integers you entered are:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        
	        
	    }
	}


