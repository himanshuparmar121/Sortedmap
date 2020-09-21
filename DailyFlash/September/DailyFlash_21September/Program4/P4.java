// Q. Wirte a java program that takes 3 integers as input and prints the largest number entered amongst them.

import java.io.*;

class LargestNum {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter three numbers:");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());

		if(n1 > n2 && n1 > n3)
			System.out.println(n1 + " is largest number amongst " + n2 + " & " + n3);
		else if(n2 > n1 && n2 > n3)
			System.out.println(n2 + " is largest number amongst " + n1 + " & " + n3);
		else
			System.out.println(n3 + " is largest number amongst " + n1 + " & " + n2);
	}
}
