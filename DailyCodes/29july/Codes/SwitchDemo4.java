class SwitchDemo {

	public static void main(String[] args) {
	
		char x = 'A';				

		switch(x) {							// byte, short, int, char
		
			case 'A' :
				System.out.println("A char");
				break;
			case 'B' :
				System.out.println("B char");
				break;
		}
	}
}

/*  Output
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo4.java 
himanshu@himansh:~/java9/July/29july/Codes$ java SwitchDemo
A char
*/
