// Q. Create an hard coded integer array of size 5 and print the numbers from array which are even.

class Array {

	public static void main(String[] args) {
	
		int[] arr = {1, 2, 3, 4, 5};

		System.out.print("Even Numbers are: ");
		for(int i = 0; i < arr.length; i++) {
		
			if(arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
