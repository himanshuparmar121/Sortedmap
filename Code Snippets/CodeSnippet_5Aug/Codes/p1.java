class Core2web {

	static int var = 2;

	public static void main(String[] args) {
	
		var = (var = 4) * (++var);
		System.out.println(var);
	} 
}

/* Output 
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p1.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p1.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ java Core2web 
20
*/

/* Explanation
 * First it assign the value 4 to the var, after that it performs the increment operator.
 */
