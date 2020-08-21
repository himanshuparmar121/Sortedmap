// Q3. Ask user to enter age, sex(M or F), martial status(Y or N) then using following rules print thier place of service, if employee is female, then she will work only in urban areas.
// If employee is a male and age is b/w 20 to 40 then he may work in anywhere.
// If employee is male and age is b/w 40 to 60 then he will work in urban urban ares only.
// And any other input of age Should print "ERROR"

import java.io.*;

class Work {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Age: ");
		int age = Integer.parseInt(br.readLine());

		System.out.print("Enter Sex (M or F): ");
		char sex = (char)br.read();
		
		br.skip(1);

		System.out.print("Enter Martial Status (Y or N): ");
		char martial = ( char)br.read();

		if(sex == 'F') {

                	if(age > 60)
        	                System.out.println("Error!!!");
                	else
                        	System.out.println("You will only work in Urban Areas.");
	        } else {

                	if(age <= 40 && age >= 20)
                        	System.out.println("You may work wherever you want to!!");

                	else if(age <= 60 && age > 40)
                        	System.out.println("You will work in Urban Areas only.");

                	else
                        	System.out.println("Error!!!");
        	}
	}
}
