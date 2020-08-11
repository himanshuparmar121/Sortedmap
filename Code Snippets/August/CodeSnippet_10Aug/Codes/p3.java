class Core2web {

	public static void main(String[] args) {
	
		System.out.println(14 % -4);
	}
}

/* Output
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ vim p3.java
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ javac p3.java
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ java Core2web 
2
*/

/* Explanation
 * In this expression, - operator has highest priority, hence -4 is converted into binary first.
 * 4 (0100 in binary). First 4's complement is (1011) + 1 => 1100, which is 12 so, 14 % 12 = 2.
 */ 
