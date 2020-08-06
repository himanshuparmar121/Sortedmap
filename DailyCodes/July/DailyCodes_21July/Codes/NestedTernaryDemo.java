class NestedTernaryDemo {

	public static void main(String[] args) {
	
		int x = 24;
		int y = 21;
		int z = 34;

		int ans = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
		System.out.println(ans);
	}
}
