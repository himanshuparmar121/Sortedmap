// Write a real time example showing composition containing 3 classes.
// Program Structure:
// First two classes will have their private variables, constructors and methods.
// In Third class inside main method pass the user input to constructorof both classes and call their methods accordingly.

class SBI {

	int totBranch = 30000;

	SBI() {
	
		System.out.println("State Bank Of India");
	}

	void feature() {
	
		System.out.println("Total Branches in India: " + totBranch);
		System.out.println("The DebitCard is of SBI");
	}
}

class ATM {

	int totAtm = 30000;

	ATM() {
	
		System.out.println("HDFC Bank");
	}

	void feature() {
	
		System.out.println("Total ATM in India: " + totAtm);
		System.out.println("Every Bank's DebitCard works here.");
	}
}

class Person {

	public static void main(String[] args) {
	
		SBI card = new SBI();
		card.feature();

		ATM atm = new ATM();
		atm.feature();

		System.out.println("Transaction Successful");
	}
}
