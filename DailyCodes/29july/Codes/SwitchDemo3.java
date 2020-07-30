class SwitchDemo2 {

	public static void main(String[] args) {
	
		float x = 30.08;				

		switch(x) {							// byte, short, int, char
		
			case 30.08 :
				System.out.println("First case");
				break;
			case 110 :
				System.out.println("Second case");
				break;
		}
	}
}

/* Output
himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo3.java
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo3.java 
SwitchDemo3.java:7: error: incompatible types: possible lossy conversion from long to int
		switch(x) {
		      ^
1 error
*/
