class SBI {

	static int no_acc_holders = 2000000;
	int no_Emp = 10000;

	static void displayAccounts() {
	
		System.out.println("No. of Account holders = "+no_acc_holders);
	}

	void showNo_of_Emp() {
	
		System.out.println("No. of Employees = "+no_Emp);
	}
}

class ICICI {

	static int no_acc_holders = 1000000;
	int no_Emp = 9000;

	static void displayAccounts() {
	
		System.out.println("No. of Account holders = "+no_acc_holders);
	}

	void showNo_of_Emp() {
	
		System.out.println("No. of Employees = "+no_Emp);
	}
}

class Banks {

	public static void main(String[] args) {
	
		SBI delhi = new SBI();
		delhi.displayAccounts();
		delhi.no_Emp = 7000;
		delhi.showNo_of_Emp();

		SBI chennai = new SBI();
		chennai.displayAccounts();
		chennai.no_Emp = 3000;
		chennai.showNo_of_Emp();

		ICICI pune = new ICICI();
		pune.displayAccounts();
		pune.no_Emp = 4000;
		pune.showNo_of_Emp();

		ICICI mumbai = new ICICI();
		mumbai.displayAccounts();
		mumbai.no_Emp = 5000;
		mumbai.showNo_of_Emp();
	}
}
