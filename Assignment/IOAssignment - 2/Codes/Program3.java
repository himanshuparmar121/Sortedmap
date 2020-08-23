import java.io.*;

class Vowel {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Character: ");
		char ch = (char)br.read();

		if(ch == 'a' || ch == 'A')
			System.out.println(ch + " is a Vowel.");
		else if(ch == 'e' || ch == 'E')
			System.out.println(ch + " is a Vowel.");
		else if(ch == 'i' || ch == 'I')
			System.out.println(ch + " is a Vowel.");
		else if(ch == 'o' || ch == 'O')
			System.out.println(ch + " is a Vowel.");
		else if(ch == 'u' || ch == 'U')
			System.out.println(ch + " is a Vowel.");
		else
			System.out.println(ch + " is a Consonant.");
	}
}
