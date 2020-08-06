class Core2web {

	public static void main(String[] args) {
	
		int var1 = 23;
		double var2 = 23.5;
		boolean b = (var1 = var2);
		System.out.println(b);
	}
}

/* output
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p6.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p6.java
p6.java:7: error: incompatible types: possible lossy conversion from double to int
		boolean b = (var1 = var2);
		                    ^
p6.java:7: error: incompatible types: int cannot be converted to boolean
		boolean b = (var1 = var2);
		                  ^
2 errors
*/

/* Explanation
 * We cannot aassign variables different data types from lower to higher.
 * If wee compare both than it would work fine.
 */
