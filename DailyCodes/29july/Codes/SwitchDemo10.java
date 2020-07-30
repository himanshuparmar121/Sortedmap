class SwitchDemo {

	public static void main(String[] args) {
	
		boolean x = true;
		boolean y = 10;

		switch(x) {
		
		}
	}
}

/* Output
himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo10.java 
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo10.java 
SwitchDemo10.java:6: error: incompatible types: int cannot be converted to boolean
		boolean y = 10;
		            ^
SwitchDemo10.java:8: error: incompatible types: boolean cannot be converted to int
		switch(x) {
		      ^
2 errors
*/
