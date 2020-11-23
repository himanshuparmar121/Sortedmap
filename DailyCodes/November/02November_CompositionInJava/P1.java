class Doctor {

	String DrName = "Mr. Shah";
	int numOfHospToVisit = 7;
	
	void Operation() {
	
		System.out.println("Neuro - Surgeon");
	}
}

class Hospital {

	String Name = "Sancheti";
	int totDoctors = 93;

	Doctor obj = new Doctor();

	void service() {
	
		System.out.println("Hospital Name = " + Name);
		System.out.println("Total Doctors = " + totDoctors);
		System.out.println("Good Service");

		visitorDoctors();
	}

	void visitorDoctors() {
	
		obj.Operation();
	}
}

class Patient {

	public static void main(String[] args) {
	
		Hospital h = new Hospital();
		h.service();
	}
}
