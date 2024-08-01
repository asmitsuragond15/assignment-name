package AssignmentDay4;
import java.util.*;

public class assignment5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10]; 
	        int sum=0,pro=1;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	       
	        System.out.println("The integers you entered are:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(numbers[i] + " ");
	        }
	        
	       
	        
	        for (int i = 0; i < 10; i++) {
	            sum+=numbers[i];
	            pro*=numbers[i];
	        }
	        
	        System.out.println("The sum of array is" +sum);
	        System.out.println("The product of array is" +pro);
	        
	        
	        
	    }
	}


