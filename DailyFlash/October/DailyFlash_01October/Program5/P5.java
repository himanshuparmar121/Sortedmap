import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

		int sizeOfArray;

		int[] arrayOne;
		int[] arrayTwo;

		System.out.println("Enter size of array: ");
		
		do {
		
			sizeOfArray = Integer.parseInt(br.readLine());

			if(sizeOfArray % 2 == 0) {
			
				System.out.println("Invalid");
			}
		} while(sizeOfArray % 2 == 0);

		arrayOne = new int[sizeOfArray];
		arrayTwo = new int[sizeOfArray];

		for(int i = 0; i < arrayTwo.length; i++) {
		
			arrayTwo[i] = 0;
		}

		for(int i = 0; i < arrayOne.length; i++) {
		
			System.out.print("Enter element: ");
			arrayOne[i] = Integer.parseInt(br.readLine());

			if(arrayOne[i] % 2 == 0) {
			
				arrayTwo[i] = -1;
			}
		}

		for(int i = 0; i < sizeOfArray; i++) {
		
			System.out.println("ArrayOne[" +(i+1)+ "] = " + arrayOne[i] + " & ARRAYTwo[" + (i+1) + "] = " + arrayTwo[i]);
		}

	}
}
