class Trip {

	void place() {
	
		System.out.println("ooohh Goa");
	}
}

class Today {

	public static void main(String[] args) {
	
		Trip obj = new Trip() {
		
			void place() {
			
				System.out.println("Alibaug");
			}
		};

		obj.place();
	}
}
