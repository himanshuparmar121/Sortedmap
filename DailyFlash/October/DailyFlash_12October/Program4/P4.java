// Use a string variable s1 to store string literal, and use another string variable s2 to store string object. Later use s1 to store string object and use s2 to store string literal. Check such swapping works.

class StringDemo {

	public static void main(String[] args) {
	
		String s1 = new String("Core2Web");
		String s2 = "BiEncaps";

		System.out.println(s1 + " " + s2);

		s1 = new String("BiEncaps");
		s2 = "Core2web";

		System.out.println(s1 + " " + s2);
	}
}
