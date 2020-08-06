class Student {

	public static void main(String[] args) {
	
		int year = 3;

		switch(year) {
		
			case 1:
				System.out.println("Student Year : 1");
				System.out.println("Student not eligible for Education Scholarship");
				break;

			case 2:
				System.out.println("Student Year : 2");
				System.out.println("Student not eligible for Education Scholarship");
				break;

			case 3:
				{
					System.out.println("Student Year : 3");
					
					int marks = 80;

					switch(marks) {
					
						case 30:
							System.out.println("Student eligible for Education Scholarship");
							break;

						case 80:
							System.out.println("Student eligible for Education Scholarship");
							break;
					}
				}
				break;
		}
	}
}
