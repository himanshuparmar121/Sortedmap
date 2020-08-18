// Q3. Write a program to find whether the chararcter is an alphabet, a digit or a special character.

class Program {

	public static void main(String[] args) {
	
		char ch = '*';
	
		if((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126))
                	System.out.println(ch + " is a special character.");
        	else if(ch >= 48 && ch <= 57)
                	System.out.println(ch + " is a digit.");
        	else if(ch >= 0 && ch <= 32)
                	System.out.println(ch + " is a space.");
        	else
                	System.out.println(ch + " is a character.");
	}
}
