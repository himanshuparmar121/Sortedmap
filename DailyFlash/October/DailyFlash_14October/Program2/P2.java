// Write a java program to find the number occuring odd number of times in an array.
// Example:
// Input: {1,2,3,2,3,1,3}
// Output: 3
// Note: Take size of array and the array as input from user.

import java.util.*;

class ArrayDemo {

	static int getOccurence(int arr[], int arr_size) {

		for(int i = 0; i < arr.length; i++) {
		
			int count = 0; 

			for(int j = 0; j < arr.length; j++) {
			
				if(arr[i] == arr[j])
					count++;
			}
		
			if(count % 2 != 0) 
				return arr[i];
		}

		return -1;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of Array: ");
		int len = sc.nextInt();
		
		int arr[] = new int[len];

		System.out.println("Enter array elements:");
		for(int i = 0; i < len; i++) {
		
			arr[i] = sc.nextInt();
		}

		System.out.println(getOccurence(arr, len));
	}
}
