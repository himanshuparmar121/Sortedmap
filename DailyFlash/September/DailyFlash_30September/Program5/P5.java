// Q. Write a java Program to take 10 integers inputs from user and print the following :
// No. of positive numbers
// No. of negative numbers
// No. of odd numbers
// No. of even numbers
// No. of 0s

import java.io.*;

class Numbers {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 10 Integers: ");
		int[] arr = new int[10];
		int pos = 0, neg = 0, odd = 0, even = 0, zer = 0;

		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] > 0)
				pos++;
			else if(arr[i] < 0)
				neg++;
			else
				zer++;

			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}

		System.out.println("No. of Positive Numbers: " + pos);
		System.out.println("No. of Negative Numbers: " + neg);
		System.out.println("No. of Odd Numbers: " + odd);
		System.out.println("No. of Even Numbers: " + even);
		System.out.println("No. of 0's: " + zer);
	}
}
