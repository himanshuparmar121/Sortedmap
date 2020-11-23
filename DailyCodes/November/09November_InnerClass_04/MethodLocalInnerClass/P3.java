class Zomato {

	void OrderPlaced() {
	
		int x = 10;

		class Hotels {
		
			static void m1() {
			
				System.out.println(x);
			}
		}

		Hotels h = new Hotels();
		h.m1();
	}

	public static void main(String[] args) {
	
		Zomato z = new Zomato();
		z.OrderPlaced();
	}
}
