// Write a program to demonstrate 2D jagged array such that first row has one element second row has 2 element and so on (All three ways taught in lecture)

class JaggedArray {

	public static void main(String[] args) {
	
		int[][] arr = {{1},{2,3},{4,5,6}};

		System.out.println("1st Type:");
		for(int i = 0; i < arr.length; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		int[][] arr1 = new int[3][];

		arr1[0] = new int[] {1};
		arr1[1] = new int[] {1,2};
		arr1[2] = new int[] {1,2,3};

		System.out.println("2nd Type:");
		for(int i = 0; i < arr1.length; i++) {
		
			for(int j = 0; j < arr1[i].length; j++) {
			
				System.out.print(arr1[i][j] + " ");
			}

			System.out.println();
		}

		int[][] arr2 = {
		
					new int[] {1},
					new int[] {1,2},
					new int[] {1,2,3}
				};

		System.out.println("3rd Type:");
		for(int i = 0; i < arr2.length; i++) {
		
			for(int j = 0; j < arr2[i].length; j++) {
			
				System.out.print(arr2[i][j] + " ");
			}

			System.out.println();
		}
	}
}
