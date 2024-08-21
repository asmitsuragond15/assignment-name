package Sorting;

public class Selectionsort {

    public void selection() {
        int arr[] = {1, 3, 23, 12, 2123, 12, 122};
        int i, j, temp;
        int s = arr.length;

        for (i = 0; i < s - 1; i++) {
            int min = i;

            for (j = i + 1; j < s; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        
        System.out.println("Sorted array:");
        for (i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Selectionsort bu = new Selectionsort();
        bu.selection();
    }
}
