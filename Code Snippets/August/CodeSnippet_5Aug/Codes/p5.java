class Core2web {

	public static void main(String[] args) {
	
		int var1 = 3;
		int var2 = 6;
		int var3 = var1 | var2;
		int var4 = var1 & var2;

		System.out.println(var3 + " " + var4);
	} 
}

/* Output
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p5.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p5.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ java Core2web 
7 2
*/

/* Explanation
 * var3 = 0011 | 0110
 * var3 = 0111 => 7
 *
 * var4 = 0011 & 0110
 * var4 = 0010 => 2
 */
