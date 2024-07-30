import java.util.*;
public class assign4
{


    public void subject() {

        System.out.println("This is Assignment QUestion 4");

        Scanner scanner   = new Scanner(System.in);
        System.out.print("Enter the subject1 marks of Robert: ");
       double subject1     = scanner.nextDouble();

       System.out.print("Enter the subject2 marks of Robert: ");
        double subject2   = scanner.nextDouble();

        System.out.print("Enter the subject3 marks of Robert: ");
        double subject3    = scanner.nextDouble();

        
        double total  =  (subject1 + subject2 + subject3);

        double percetage=(total/3);
 


         System.out.println("Robert total marks is  " + total);
         System.out.println("Robert total marks is  " + percetage +"%" );
    }

    public static void main(String[] args)
    {
        assign4 a1        = new assign4();
        a1.subject();

    
    }
}
