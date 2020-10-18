// Perfect Number

import java.io.*;

class PerfectNumber {

	public static void main(String[] args) throws IOException {
	
		int sum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());

		for(int num = 1; num < inputNum - 1; num++) {
		
			if(inputNum % num == 0)
				sum = sum + num;
		}

		if(sum == inputNum)
			System.out.println(inputNum + " is a perfect Number.");
		else
			System.out.println(inputNum + " is NOT a perfect Number.");
	}
}
