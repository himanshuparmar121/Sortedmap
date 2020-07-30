class SwitchDemo {

	public static void main(String[] args) {
	
		char x = 'A';				

		switch(x) {							// byte, short, int, char, String
		
			case 65 :
				System.out.println("A - ASCII");
				break;
			case 'A' :
				System.out.println("A char");
				break;
		}
	}
}

/* Output
himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo6.java 
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo6.java 
SwitchDemo6.java:12: error: duplicate case label
			case 'A' :
			^
1 error
*/
