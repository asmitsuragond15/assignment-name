import java.util.*;
        public class assign1
        {


            public void reactagle() {

                System.out.println("This Area of Reactagle");
                double a,b;
                Scanner scanner   = new Scanner(System.in);
                System.out.print("Enter the length of the rectangle: ");
               double length      = scanner.nextDouble();

                System.out.print("Enter the breadth of the rectangle: ");
                double breadth    = scanner.nextDouble();

                double area       = length * breadth;
                double perimeter  = 2 * (length + breadth);

        
                 System.out.println("Area of the rectangle: " + area);
                 System.out.println("Perimeter of the rectangle: " + perimeter);

            }
        
            public static void main(String[] args)
            {
                assign1 a1        = new assign1();
                a1.reactagle();

            
            }
        }