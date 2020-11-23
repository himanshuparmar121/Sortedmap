class Hospital {

	static class Doctors {
	
		int p = 10;
		static int q = 20;

		void serviceAt() {
		
			System.out.println("Work At Aadhar Hospital");
			System.out.println(p);
			System.out.println(q);
		}
	}

	public static void main(String[] args) {
	
		Doctors shah = new Doctors();
		shah.serviceAt();
	}
}
