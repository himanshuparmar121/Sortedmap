// WAJP that contains the following classes:
// -CreditCard
// -DebitCard
// The implementation of the classes can be your chaoice.
// Write a Payment class, with overloaded method makePayment() for the parameters CreditCard and DebitCard respectively.
// Print in the method that is being used. Write class Demo that has main(), make the call to the overloaded method.

class CreditCard {

	CreditCard() {
	
		System.out.println("ICICI Credit Card");
	}
}

class DebitCard {

	DebitCard() {
	
		System.out.println("SBI Debit Card");
	}
}

class Payment {

	void makePayment(CreditCard obj) {
	
		System.out.println("Payment Successful By Credit Card");
	}
	
	void makePayment(DebitCard obj) {
	
		System.out.println("Payment Successful By Debit Card");
	}
}

class Demo {

	public static void main(String[] args) {
	
		Payment pay = new Payment();
		pay.makePayment(new DebitCard());
		pay.makePayment(new CreditCard());
	}
}
