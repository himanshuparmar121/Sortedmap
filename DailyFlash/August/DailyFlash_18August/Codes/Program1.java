// Q1. Write a program to find whether the character is alphabet or not.

class Program {

	public static void main(String[] args) {
	
		char ch = 'v';

		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			System.out.println(ch + " is a alphabet.");
		else
			System.out.println(ch + " is not a alphabet.");
	}
}
