// WAJP that accepts 2D Array of rows and columns from user, print that 2D array in matrix form print addition of all rows and columns

import java.util.*;

class ArrayAdd {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Row:");
                int row = sc.nextInt();

                System.out.println("Enter Columns:");
                int col = sc.nextInt();

                int[][] marr = new int[row][col];

                System.out.println("Enter elements:");
                for(int i = 0; i < row; i++) {

                        for(int j = 0; j < col; j++) {

                                marr[i][j] = sc.nextInt();
                        }
                }

                System.out.println("Array:");
                System.out.println();
                for(int i = 0; i < row; i++) {

                        for(int j = 0; j < col; j++) {

                                System.out.print(marr[i][j] + " ");
                        }

                        System.out.println();
                }

                System.out.println();
		int add = 0;

                for(int i = 0; i < row; i++) {

			add = 0;

                        for(int j = 0; j < col; j++) {

				add += marr[i][j];
			}

			System.out.println("Sum of row " + (i+1) + ": " + add);
		}
                System.out.println();
                
		for(int i = 0; i < col; i++) {

			add = 0;

                        for(int j = 0; j < col; j++) {

				add += marr[i][j];
			}

			System.out.println("Sum of column " + (i+1) + ": " + add);
		}
                System.out.println();
	}
}
