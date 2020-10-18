class StringDemo {

	public static void main(String[] args) {
	
		String s1 = new String("CivicGen");
		String s2 = new String("Bielearn");

		System.out.println(s1.endsWith("Gen"));		// true
		System.out.println(s2.endsWith("ear"));		// false
		System.out.println(s2.endsWith("arn"));		// true
	}
}
