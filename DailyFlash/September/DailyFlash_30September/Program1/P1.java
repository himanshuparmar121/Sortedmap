// Q. Write a Program to test if an array contains a specific value. 
// my_array1 = {1789, 2035, 1899, 2013, 1458, 2458, 1254, 1472, 2565};
// Conatins 2013 in array ?
// Conatins 2015 in array ?

import java.util.*;

class Array {

	public static void main(String[] args){
	
		int[] arr = {1789, 2035, 1899, 2013, 1458, 2458, 1254, 1472, 2565};

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number to check: ");
		int n = sc.nextInt();
		int flag = 0;

		for(int i = 0; i < arr.length; i++) {
	
			if(arr[i] == n) {
				
				flag = 1;
				break;
			} else 
				flag = 0;
		}

		if(flag == 1)
			System.out.println("Yes the array contains " + n);
		else 
			System.out.println("NO the array doesn't contains " + n);
	}
}

