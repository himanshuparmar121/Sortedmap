// Write a real time example of multilevel inheritance on Google Company.(Note - 3 classes required)

class Google {

	Google() {
	
		System.out.println("Google");
	}

	void company() {
	
		System.out.println(" - Google Company\n");
	}
}

class PlayStore extends Google {

	PlayStore() {
	
		System.out.println(" - Google PlayStore");
	}

	void product() {
	
		System.out.println(" -- Use to install various apps for android mobile\n");
	}
}

class GooglePay extends PlayStore {

	GooglePay() {
	
		System.out.println(" -- Google Pay");
	}

	void app() {
	
		System.out.println(" --- App used for money transfer");
	}
}

class Mobile {

	public static void main(String[] args) {
	
		Google obj1 = new Google();
		obj1.company();

		PlayStore obj2 = new PlayStore();
		obj2.product();

		GooglePay obj3 = new GooglePay();
		obj3.app();
	}
}
