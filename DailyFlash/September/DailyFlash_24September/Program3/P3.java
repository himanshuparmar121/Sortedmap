// Q. Take Information of 3 Students (use any loop) student info is:
// 	StudentName(String), Grade(char), Age(int) and marks(double) as Input from user and prints it. Use StringTokenizer delimiter is " ".

import java.io.*;
import java.util.*;

class Student {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Student name, Age, grade, marks: ");
		for(int i = 0; i < 3; i++) {
		
			String StudDetails = br.readLine();
			StringTokenizer st = new StringTokenizer(StudDetails, " ");
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			char grade = st.nextToken().charAt(0);;
			double marks = Double.parseDouble(st.nextToken());

			System.out.println("Name: " + name);
			System.out.println("Grade: " + grade);
			System.out.println("Age: " + age);
			System.out.println("Marks: " + marks);
		}
	}
}
