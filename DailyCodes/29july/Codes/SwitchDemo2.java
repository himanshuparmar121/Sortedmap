class SwitchDemo2 {

	public static void main(String[] args) {
	
		long x = 32767;				

		switch(x) {							// byte, short, int, char
		
			case 32767 :
				System.out.println("First case");
				break;
			case 110 :
				System.out.println("Second case");
				break;
		}
	}
}

/* Output
himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo2.java
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo2.java 
SwitchDemo2.java:7: error: incompatible types: possible lossy conversion from long to int
		switch(x) {
		      ^
1 error
*/
