class logicalDemo {

	public static void main(String[] args) {
	
		int x = 2;
		int y = 3;
		boolean ans;

		ans = (++x < y++) && (x++ < ++y);
		System.out.println("Ans = "+ ans);
		System.out.println("X = "+ x);
		System.out.println("Y = "+ y);

		ans = (++x <= y++) || (x++ > ++y);
		System.out.println("Ans = "+ ans);
		System.out.println("X = "+ x);
		System.out.println("Y = "+ y);
	}
}
