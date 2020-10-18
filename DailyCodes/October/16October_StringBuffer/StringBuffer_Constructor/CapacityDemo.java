class StringBufferConstr {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());	// 16

		sb1.append("Core2web");		
		System.out.println(sb1.capacity());	// 16
		
		sb1.append("Technologies");		
		System.out.println(sb1.capacity());	// 34
	}
}

