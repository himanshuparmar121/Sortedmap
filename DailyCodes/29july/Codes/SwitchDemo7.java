class SwitchDemo {

	public static void main(String[] args) {
	
		String x = "Shashi";

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
himanshu@himansh:~/java9/July/29july/Codes$ vim SwitchDemo7.java 
himanshu@himansh:~/java9/July/29july/Codes$ javac SwitchDemo7.java 
himanshu@himansh:~/java9/July/29july/Codes$ java SwitchDemo
Camel case
*/
