package Sorting;


public class InsertionSort {

    public void insertionSort() {
        int arr[] = {12, 11, 13, 5, 6};
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

           
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        InsertionSort in = new InsertionSort();
        in.insertionSort();
    }
}
