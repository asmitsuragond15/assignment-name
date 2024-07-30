import java.util.*;
public class assign6
{


    public void fah() 
    {

        System.out.println("This is Assignment QUestion 4");

        Scanner scanner   = new Scanner(System.in);
        System.out.print("Enter in fahrenheit");
       double Fahrenheit     = scanner.nextDouble();

       double celsius= ((Fahrenheit-32)*5)/9;  

        System.out.println("The temperature in  " + celsius );
    }

    public static void main(String[] args)
    {
        assign6 a1        = new assign6();
        a1.fah();

    
    }
}
