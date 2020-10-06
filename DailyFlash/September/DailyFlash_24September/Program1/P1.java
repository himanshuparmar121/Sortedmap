// Q. Take StudentName(String), Grade(char), Age(int) and Marks(double) as Input from user and print it, use String Tokenizer.

import java.io.*;
import java.util.*;

class Student {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Name, Grade, Age and Marks:");
		String StudDetails = br.readLine();

		StringTokenizer st = new StringTokenizer(StudDetails, ", ");
		String StudName = st.nextToken();
		char grade = st.nextToken().charAt(0);
		int age = Integer.parseInt(st.nextToken());
		double marks = Double.parseDouble(st.nextToken());

		System.out.println("Student Name: " + StudName);
		System.out.println("Student Grade: " + grade);
		System.out.println("Student Age: " +age);
		System.out.println("Student Marks: " + marks);
	}
}
