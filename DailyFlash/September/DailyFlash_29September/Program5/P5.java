// Q. Take a array element {A, B, C, D, E} and convert into lower case letter and print it.

class Array {

	public static void main(String[] args) {
	
		char[] arr = {'A', 'B', 'C', 'D', 'E'};

		for(int i = 0; i < arr.length; i++) {
		
			if(arr[i] >= 65 && arr[i] <= 90)
				arr[i] += 32;

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
