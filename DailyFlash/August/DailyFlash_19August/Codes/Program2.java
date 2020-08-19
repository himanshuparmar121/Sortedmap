// Q2. Write a Program to take a integer ranging between 0 and 6 and print corresponding weekday.

class Program {

	public static void main(String[] args) {
	
		int day = 2;

		if(day == 0)
                	System.out.println("Monday.");
        	else if(day == 1)
                	System.out.println("Tuesday.");
        	else if(day == 2)
                	System.out.println("Wednesday.");
        	else if(day == 3)
        	        System.out.println("Thursday.");
	        else if(day == 4)
        	        System.out.println("Friday.");
	        else if(day == 5)
                	System.out.println("Saturday.");
        	else
	                System.out.println("Sunday.");
	}
}
