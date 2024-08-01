package AssignmentDay4;
import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int maxDifference = numbers[n - 1] - numbers[0];
        System.out.println("The pair with the maximum difference is: (" + numbers[n - 1] + ", " + numbers[0] + ")");
        System.out.println("Maximum difference: " + maxDifference);
        int minDifference = numbers[1] - numbers[0];
        System.out.println("The pair with the minimum difference is: (" + numbers[1] + ", " + numbers[0] + ")");
        System.out.println("Minimum difference: " + minDifference);
    }
}
