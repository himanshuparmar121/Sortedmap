class Programming {

	public static void main(String[] args) {
	
		char ch = 'J';
		System.out.println("Enter character :" + ch);

		switch(ch) {
		
			case 'C' :
				System.out.println("C Programming");
				break;
			case 'P' :
				System.out.println("Python");
				break;
			case 'A' :
				System.out.println("Ada");
				break;
			case 'H' :
				System.out.println("HTML");
				break;
			case 'F' :
				System.out.println("Fortran");
				break;
			case 'J' :
				System.out.println("Java");
				break;
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ vim Program2.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ javac Program2.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ java Programming 
Enter character :J
Java
*/
