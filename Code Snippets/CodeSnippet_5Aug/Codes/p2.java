class Core2web {

	public static void main(String[] args) {
	
		int var1 = 10;
		double var2 = 11;

		if(boolean var3 = true)
			System.out.println(++var1);
		else
			System.out.println(++var2);
	}
}

/* Output
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p2.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p2.java
p2.java:8: error: '.class' expected
		if(boolean var3 = true)
		           ^
p2.java:8: error: ';' expected
		if(boolean var3 = true)
		                      ^
p2.java:10: error: 'else' without 'if'
		else
		^
3 errors
*/

/* Explanation
 * Initialization in if is not valid syntax.
 */
