// Take two Strings from user and store one String in String literal and another in string object. Print both the STrings seperated by double quotes.

class StringDemo {

	public static void main(String[] args) {
	
		String s1 = "Himanshu";
		String s2 = new String("Parmar");

		System.out.println("\"" + s1 + "\"\"" + s2 + "\"");
	}
}
