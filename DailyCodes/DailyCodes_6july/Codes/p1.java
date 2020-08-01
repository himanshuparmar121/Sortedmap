class Capgemini {

	static int noOfEmp = 200000;
	int projectCount = 200;

	void displayProject() {
	
		System.out.println("Project Count = " +projectCount);
	}

	static void EmpInfo() {
	
		System.out.println("Number of Employee = " +noOfEmp);
	}
}


class TCS {

	static int noOfEmp = 300000;
	int projectCount = 350;

	void displayProject() {
	
		System.out.println("Project Count = " +projectCount);
	}

	static void EmpInfo() {
	
		System.out.println("Number of Employee = " +noOfEmp);
	}
}

class Companies {

	public static void main(String[] args) {
	
		Capgemini pune = new Capgemini();
		pune.projectCount = 130;
		pune.displayProject();
		pune.EmpInfo();

		Capgemini chennai = new Capgemini();
		chennai.projectCount = 70;
		chennai.displayProject();
		chennai.EmpInfo();

		TCS mumbai = new TCS();
		mumbai.projectCount = 200;
		mumbai.displayProject();
		mumbai.EmpInfo();

		TCS bangaluru = new TCS();
		bangaluru.projectCount = 150;
		bangaluru.displayProject();
		bangaluru.EmpInfo();
	}
}
