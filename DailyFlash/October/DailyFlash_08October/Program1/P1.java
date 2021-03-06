// WAP for 2D jagged Array from user and print the sum of numbers divisible by 5.

import java.util.*;

class JaggedDemo {

	public static void main(String[] args) {

		int[][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Elements:");
		for(int i = 0; i < arr.length; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = sc.nextInt();
			}
		}

		int sum = 0;

		for(int i = 0; i < arr.length; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {

				if(arr[i][j] % 5 == 0)
					sum += arr[i][j];
			}
		}

		System.out.println("Sum = " + sum);

	}
}
