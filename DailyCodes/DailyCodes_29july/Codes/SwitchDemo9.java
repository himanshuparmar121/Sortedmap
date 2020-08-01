class SwitchDemo {

	public static void main(String[] args) {
	
		StringBuffer x = new StringBuffer("Shashi");

		switch(x) {
		
			case "Shashi":
				System.out.println("Camel case");
				break;
			case "shashi":
				System.out.println("small case");
				break;
		}
	} 
}

/* Output
himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo9.java 
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo9.java 
SwitchDemo9.java:7: error: incompatible types: StringBuffer cannot be converted to int
		switch(x) {
		      ^
1 error
*/
