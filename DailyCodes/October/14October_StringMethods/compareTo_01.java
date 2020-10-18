class StringDemo {

	public static void main(String[] args) {
	
		String s1 = "Shashi";
		String s2 = new String("Shashi");
		String s3 = new String("Biencaps");
		String s4 = "Bielearn";
		String s5 = new String("Shashikant");
		String s6 = "SHASHI";

		// equals method
		System.out.println(s1.equals(s2));	// true
		System.out.println(s1.equals(s3));	// false

		// equals Ignore method
		System.out.println(s1.equalsIgnoreCase(s6));	// true

		// compareTo 1
		System.out.println(s1.compareTo(s2));		// 0

		// compareTo 2
		System.out.println(s3.compareTo(s1));		// -17
		System.out.println(s1.compareTo(s5));		// -4

		//compareTo 3
		System.out.println(s4.compareTo(s3));		// -2

	}
}
