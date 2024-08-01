
import java.util.Scanner;
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
class AgeValidator {
 public void validate(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or older.");
     } else {
         System.out.println("Access granted.");
     }
 }
}

public class problem2 {
 public static void main(String[] args) {
     System.out.println("Checking if the person's age is above 18 or below 18");
     
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the Age of Person: ");
     int age = scanner.nextInt();
     AgeValidator validator = new AgeValidator();
     try {
         validator.validate(age);
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
