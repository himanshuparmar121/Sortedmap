// Q. Wirte a java program that accepts 2 numbers as command line argumnets and prints the summation of those two numbers.

class Addition {

	public static void main(String... num) {
	
		int n1 = Integer.parseInt(num[0]);
		int n2 = Integer.parseInt(num[1]);

		System.out.println("The Addition of " + n1 + " & " + n2 + " is: " + (n1 + n2));
	}
}
