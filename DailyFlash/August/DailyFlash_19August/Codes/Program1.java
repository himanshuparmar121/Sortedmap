// Q1. Write a Program to find whether a character is Uppercase or lowercase.

class Program {


	public static void main(String[] args) {
	
		char ch = 'v';

		if(ch >= 'A' && ch <= 'Z')
			System.out.println("Letter " + ch + " is Uppercase.");
		else
			System.out.println("Letter " + ch + " is Lowercase.");
	}
}
