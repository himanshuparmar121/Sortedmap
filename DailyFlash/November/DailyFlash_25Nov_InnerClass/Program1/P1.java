class Hostel {

	int hostelId;

	Hostel(int id) {
	
		hostelId = id;
	}

	class Student {
	
		int studHostelId;
		int studId;

		Student(int hId, int sId) {
		
			studHostelId = hId;
			studId = sId;
		}

		void checkHostelId() {
		
			if(studHostelId == hostelId)
				System.out.println("Allowed");
			else
				System.out.println("Not Allowed");
		}
	}

	public static void main(String[] args) {
	
		Hostel obj = new Hostel(105);
		Student studobj = obj.new Student(105, 115);
		studobj.checkHostelId();
	}
}
