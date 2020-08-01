class Switchdemo1 {

		public static void main(String[] args) {
		
			byte x = 128;			// byte range is from 127 to -128

			switch(x) {
			
				case 128 :
					System.out.println("First case");
					break;
				case 110 :
					System.out.println("First case");
					break;
			}
		}
}

/* Output
himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo1.java
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo1.java 
SwitchDemo1.java:12: error: incompatible types: possible lossy conversion from int to byte
				case 200 :
				     ^
1 error

himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo1.java
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo1.java 
SwitchDemo1.java:5: error: incompatible types: possible lossy conversion from int to byte
			byte x = 128;			// byte range is from 127 to -128
			         ^
SwitchDemo1.java:9: error: incompatible types: possible lossy conversion from int to byte
				case 128 :
				     ^
2 errors
*/
