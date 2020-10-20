// Write a java program to find the length of a multi dimensional array without using length method.

class ArrayLen {

	public static void main(String[] args) {
	
		int[][] a = {{10,20},{30,40},{50,60}};

		int cnt = 0, r = 3, c = 2;
		for(int i = 0; i < 3; i++) {
		
			for(int j = 0; j < 2; j++)
				cnt++;
		}

		System.out.println("2D Array Size = " + cnt / c);
		System.out.println("2D Array Size = " + a.length);
	} 
}
