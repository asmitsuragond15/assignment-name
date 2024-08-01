package AssignmentDay4;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;

            System.out.println("Array after iteration " + (i + 1) + ":");
            for (int k = 0; k < n; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        }


        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
