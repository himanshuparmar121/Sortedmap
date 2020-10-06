// Q. Write a Java Program to find the index of an array element.
// my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
// Index position of 25?
// Index position of 77?

import java.util.*;

class Array {

	public static void main(String[] args) {
	
		int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < arr.length; i++) {
		
			if(arr[i] == n)
				System.out.println("Index position of " + n + " is: " + i);
		}
		
	}
}
