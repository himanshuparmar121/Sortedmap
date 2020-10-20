// Write a java Program to find the missing number in a sorted array.
// Example:
// Input: {1,3,4,5,6}
// Output: 2

import java.util.*;

class Program {

	static int getMissingNo(int a[]) {
	
		int n = a.length;
		for(int i = 0; i < n; i++) {
		
			if(a[i] != (i+1))
				return (i+1);
		}

		return n+1;
	}
	public static void main(String... args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		System.out.println("Enter the array elements: ");

		int arr[] = new int[size];

		for(int i = 0; i < size; i++) {
		
			arr[i] = sc.nextInt();
		}

		System.out.println(getMissingNo(arr));
	}
}
