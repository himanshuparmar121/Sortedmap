// Q1. Write a code in Java, to determine whether the given random year is leap.

class LeapYear {

	public static void main(String[] args) {
	
		int year = 2020;
		System.out.println("Enter a Year : " + year);

		if(year % 4 == 0)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}
