// Q. Store the score of cricket player in an integer array and print the total score of team.

class Cricket {

	public static void main(String[] args) {
	
		int arr[] = {20, 40, 55, 45, 90};
		int sum = 0;

		for(int i = 0; i < arr.length; i++) {
		
			sum += arr[i];
		}

		System.out.println("Score = " + sum);
	}
}
