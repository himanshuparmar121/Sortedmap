class Power {

	public static void main(String[] args) {
	
		int num = 10, power = 8;
		int dup = num;
		int res = 0;

		for(int i = 1; i <= power; i++) {
		
			res = dup * num;
		}

		System.out.println(dup + " to the power " + power + " is " + res);
	}
}
