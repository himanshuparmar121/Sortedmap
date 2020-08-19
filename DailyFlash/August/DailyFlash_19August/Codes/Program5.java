// Q5. Write a Program that takes angles of a triangle from user whethwe that triangle is valid or not. (Note : Addition of angles of triangle has to be 180 in order to consider it as a valid one.)

class Program {

	public static void main(String[] args) {
	
		int angle1 = 30, angle2 = 50, angle3 = 70;

		if(angle1 + angle2 + angle3 == 180)
			System.out.println("Triangle with angles " + angle1 + ", " + angle2 + " and " +angle3 + " is valid.");
		else
			System.out.println("Triangle with angles " + angle1 + ", " + angle2 + " and " +angle3 + " is invalid.");
	}
}
