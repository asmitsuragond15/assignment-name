package AssignmentDay4;
import java.util.*;

public class assignment3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[20]; 
	        int a=0,b=0,c=0,even=0,odd=0;
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	       
	        System.out.println("The integers you entered are:");
	        for (int i = 0; i < 20; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	       
	        
	        
	        for (int i = 0; i < 20; i++) 
	        {
	        if(numbers[i]<0)
	        {
	        	a++;
	        }
	        if(numbers[i]>0)
	        {
	        	b++;
	        }
	        if(numbers[i]==0)
	        {
	        	c++;
	        }
	        if(numbers[i]/2==0)
	        {
	        	even++;
	        }
	        else {
	        	odd++;
	        	
			}
	        }
	        System.out.print("The Postive number present " +b+"\n");
	        System.out.print("The negative number present " +a+"\n");
	        System.out.print("The zero number present " +c+"\n");
	        System.out.print("The Even number are" +even+"\n");
	        System.out.print("The odd number are" +odd+"\n");
	    }
	}


