class Core2web {

	public static void leftshift(int var1, int var2) {
	
		var1 <<= var2;
	}

	public static void main(String[] args) {
	
		int var1 = 4, var2 = 2;
		leftshift(var1, var2);
		System.out.println(var1);
	}
}

/* Output
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p3.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p3.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ java Core2web 
4
*/

/* Explanation
 * Java only ever passses arguments to a method by value (i.e., a copy of the variable) and never by reference.
 * Therefore the variable var1 remains unchanged in main method.
 */
