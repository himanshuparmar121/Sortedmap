class Core2web {

	public static void main(String[] args) {
	
		boolean var1 = true, var2 = false;
		System.out.println(var1 + var2);
	}
}

/* Output
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ vim p1.java
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ javac p1.java
p1.java:6: error: bad operand types for binary operator '+'
		System.out.println(var1 + var2);
		                        ^
  first type:  boolean
  second type: boolean
1 error
*/
