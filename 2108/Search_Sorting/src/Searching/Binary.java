package Searching;

import java.util.Scanner;

public class Binary {

	public void binary() {
		int key;
		int arr[] = { 1, 3, 23, 12, 2123, 12, 122 };

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key to Search=");
		key = sc.nextInt();
	
		int n = arr.length;
		int low = 0, high = n - 1;
		

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("The key is founded in array that is " + key);
				return;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		System.out.println("The key is not founded in array");

	}

	public static void main(String[] args) {
		Binary bi = new Binary();
		bi.binary();
	}

}
