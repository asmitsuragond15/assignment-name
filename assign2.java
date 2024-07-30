import java.util.*;
public class assign2
{


    public void triangle() {

        System.out.println("This Area of Reactagle");

        Scanner scanner   = new Scanner(System.in);
        System.out.print("Enter the side1 of the triangle: ");
       double side1     = scanner.nextDouble();

        System.out.print("Enter the side2 of the triangle: ");
        double side2    = scanner.nextDouble();

        System.out.print("Enter the side3 of the triangle: ");
        double side3    = scanner.nextDouble();

        
        double perimeter  =  (side1 + side2 + side3);
 

         System.out.println("Perimeter of the rectangle: " + perimeter);

    }

    public static void main(String[] args)
    {
        assign2 a1        = new assign2();
        a1.triangle();

    
    }
}
