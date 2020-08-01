class SwitchDemo {

	public static void main(String[] args) {
	
		char x = '8';				

		switch(x) {							// byte, short, int, char
		
			case 8 :
				System.out.println("8 val");
				break;
			case '8' :
				System.out.println("8 char");
				break;
		}
	}
}

/* Output
himanshu@himansh:~/java9/July/29july/Codes$ java SwitchDemo5.java 
8 char
*/
