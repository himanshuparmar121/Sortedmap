class StringDemo {

	public static void main(String[] args) {
	
		String s1 = "Himanshu";
		String s2 = "Parmar";

		s1.concat(s2);

		System.out.println(s1);			// Himanshu
		System.out.println(s2);			// Parmar
		System.out.println(s1.concat(s2));	// HimanshuParmar
	}
}
