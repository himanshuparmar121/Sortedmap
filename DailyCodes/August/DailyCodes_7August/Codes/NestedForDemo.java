class NestedDemo {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 4; i++) {
		
			for(int j = 1; j <= 4; j++) {
			
				System.out.print(" * ");
			}

			System.out.println();
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ vim NestedForDemo.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ javac NestedForDemo.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ java NestedDemo 
 *  *  *  * 
 *  *  *  * 
 *  *  *  * 
 *  *  *  * 
*/
