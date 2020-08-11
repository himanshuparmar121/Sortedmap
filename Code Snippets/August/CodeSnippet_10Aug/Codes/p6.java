class Core2web {

	public static void main(String[] args) {
	
		char var1 = 'Z';
		char var2 = 'T';

		System.out.println(var2 = var1--);
		System.out.println(--var2);
	}
}

/* Output
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ vim p6.java
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ javac p6.java
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ java Core2web 
Z
Y
*/

/* Explanation 
 * In first SOP() value of var1 i.e., 'Z' is assigned to var2 and then the var1 is displayed i.e., 'Z,
 * because the assignment operator and the function call takes priority over post-increment.
 * In the second SOOP() the pre-decrement takes priority over the function call which displays 'Y'.
 */
