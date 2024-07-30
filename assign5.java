import java.util.*;
public class assign5
{


    public void swap1() {

        System.out.println("This is Assignment QUestion 5");

        Scanner scanner   = new Scanner(System.in);
        System.out.print("Enter the value of a=");
       double a     = scanner.nextDouble();

       System.out.print("Enter the value of b= ");
        double b   = scanner.nextDouble();

    
        
     
      double temp = a;
      a = b;
      b = temp;


         System.out.println("The value of A is  " + a);
         System.out.println("The value of B is   " + b);
    }
    public void swap2() {

        System.out.println("This is Assignment QUestion 5.1");

        Scanner scanner   = new Scanner(System.in);
        System.out.print("Enter the value of a=");
       double a     = scanner.nextDouble();

       System.out.print("Enter the value of b= ");
        double b   = scanner.nextDouble();

    System.out.println("Before swap: a = " + a + ", b = " + b);
        
    
    a = a + b;
    b = a - b; 
    a = a - b; 
    
    System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args)
    {
        assign5 a1        = new assign5();
        a1.swap1();
        a1.swap2();

    
    }
}
