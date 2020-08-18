// Q2. Write a program to check whether a character is vowel or consonant.

class Program {

	public static void main(String[] args) {
	
		char ch = 'a';

		if(ch == 'A' || ch == 'a')
			System.out.println(ch + " is a vowel.");
		else if(ch == 'E' || ch == 'e')
			System.out.println(ch + " is a vowel.");
		else if(ch == 'I' || ch == 'i')
			System.out.println(ch + " is a vowel.");
		else if(ch == 'O' || ch == 'o')
			System.out.println(ch + " is a vowel.");
		else if(ch == 'U' || ch == 'u')
			System.out.println(ch + " is a vowel.");
		else
			System.out.println(ch + " is a consonant.");
	}
}
