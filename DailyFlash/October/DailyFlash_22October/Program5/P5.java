// Write a program to create an StringBuffer object and append it with another String and print the result. 
// Note: It must be a StringBuffer Object not String.
//
// Output: Core2Web Technologies

class Program {

	public static void main(String[] args) {
	
		StringBuffer s1 = new StringBuffer("Core2web");
		StringBuffer s2 = new StringBuffer("Technologies");

		s1.append(s2);

		System.out.println(s1);
	}
}
