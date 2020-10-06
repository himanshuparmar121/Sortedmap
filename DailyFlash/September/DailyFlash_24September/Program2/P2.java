// Q. Take information of 2 Students: StudentInfo is - StudentName(String), Grade(char), Age(int) and Marks(double) as INput from user and print it, use StringTokenizer handle empty space.

import java.io.*;
import java.util.*;

class Student {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Student Name, Grade, Age and Marks:");
                
		String Stud1Details = br.readLine();

               	StringTokenizer st1 = new StringTokenizer(Stud1Details, ", ");
                String StudName1 = st1.nextToken().trim();
       	        char grade1 = st1.nextToken().trim().charAt(0);
               	int age1 = Integer.parseInt(st1.nextToken().trim());
               	double marks1 = Double.parseDouble(st1.nextToken().trim());

                String Stud2Details = br.readLine();

               	StringTokenizer st2 = new StringTokenizer(Stud2Details, ", ");
	       	String StudName2 = st2.nextToken().trim();
       	        char grade2 = st2.nextToken().trim().charAt(0);
               	int age2 = Integer.parseInt(st2.nextToken().trim());
               	double marks2 = Double.parseDouble(st2.nextToken().trim());

               	System.out.println("Student1 Name: " + StudName1);
               	System.out.println("Student1 Grade: " + grade1);
               	System.out.println("Student1 Age: " +age1);
               	System.out.println("Student1 Marks: " + marks1);
               	
		System.out.println("Student2 Name: " + StudName2);
               	System.out.println("Student2 Grade: " + grade2);
               	System.out.println("Student2 Age: " +age2);
               	System.out.println("Student2 Marks: " + marks2);
        }
}
