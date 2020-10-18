// Write a java program that accepts 2D jagged array from user and print sum of all elements

import java.util.*;

class JaggedDemo {

        public static void main(String[] args) {

                int[][] arr = new int[3][];

                arr[0] = new int[2];
                arr[1] = new int[3];
                arr[2] = new int[4];

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Array Elements:");
                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++) {

                                arr[i][j] = sc.nextInt();
                        }
                }

                int sum = 0;

                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++) {

                                sum += arr[i][j];
                        }
                }

                System.out.println("Sum = " + sum);

        }
}

