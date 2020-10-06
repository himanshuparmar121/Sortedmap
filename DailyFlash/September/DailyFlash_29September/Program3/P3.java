// Q. Create a hardcoded float array of size 5 and print the average of the elements of the array.

class Array {

	public static void main(String[] args) {
	
		float[] arr = {10.5f, 20.5f, 30.5f, 40.5f, 50.5f};
		double avg = 0;
		float sum = 0;

		for(int i = 0; i < arr.length; i++) {
		
			sum += arr[i];
		}

		avg = (sum / arr.length);

		System.out.println("Average = " + avg);
	}
}
