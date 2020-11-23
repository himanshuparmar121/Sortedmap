class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer("Biencaps");
		StringBuffer sb2 = new StringBuffer("Shashi");

		// length
		System.out.println(sb2.length());	//6

		// capacity
		System.out.println(sb2.capacity());	//22

		//charAt
		System.out.println(sb2.charAt(3));	//s

		//append
		sb2.append("Bagal");
		System.out.println(sb2);		// shashiBagal

		sb2.append(28);
		System.out.println(sb2);		// shashiBagal28

		sb2.append(sb1);
		System.out.println(sb1);		// shashiBagal28Biencaps

		// insert
		sb2.insert(13, "Core2web");
		System.out.println(sb2);

		// deleteCharAt
		sb2.deleteCharAt(11);
		System.out.println(sb2);		// shashiBagal8Core2webBiencaps

		// delete
		sb2.delete(6,12);
		System.out.println(sb2);		// shashiCore2webBiencaps

		// reverse
		sb2.reverse();
		System.out.println(sb2);		// spacneiBbew2eroCihsahs
		sb2.reverse();

		// setLength
		sb2.setLength(6);
		System.out.println(sb2);		// shashi
	}
}
