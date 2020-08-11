class Core2web {

	public static void main(String[] args) {
	
		int var = 2;

		System.out.println(true == (13 != 4) ? var += 4 : var *= 4);
	}
}

/* Output
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ vim p10.java
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ javac p10.java
p10.java:7: error: unexpected type
		System.out.println(true == (13 != 4) ? var += 4 : var *= 4);
		                                     ^
  required: variable
  found:    value
1 error
*/

/* Explanation
 * we cannot use multilayered condition with ternary operator.
 */
