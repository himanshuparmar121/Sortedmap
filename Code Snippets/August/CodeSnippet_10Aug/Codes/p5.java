class Core2web {

	public static void main(String[] args) {
	
		char var1 = 'Z';
		System.out.println(--var++);
	}
}

/* Output
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ vim p5.java
himanshu@himansh:~/java9/CodeSnippets/CodeSnippet_10Aug/Codes$ javac p5.java
p5.java:6: error: cannot find symbol
		System.out.println(--var++);
		                     ^
  symbol:   variable var
  location: class Core2web
1 error
*/

/* Explanation 
 * we cannot use -- and ++ operator on same operand on same time.
 */
