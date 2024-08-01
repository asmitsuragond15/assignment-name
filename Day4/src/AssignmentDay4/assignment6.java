package AssignmentDay4;
import java.util.*;

public class assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[10][10]; 
      
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter integer for position (" + (i + 1) + "," + (j + 1) + "): ");
                numbers[i][j] = scanner.nextInt();
            }
        }
       
        System.out.println("The integers you entered are:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
