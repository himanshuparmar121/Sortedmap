class IfelseDemo4 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;

		if(++x < y++){

			System.out.println("in If Statement");
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else {

			System.out.println("In else Statement ");
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}

		System.out.println("Out of if");
	}
}
