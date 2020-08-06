class Core2web {

	public static void main(String[] args) {
	
		int var1 = 5;
		int var2 = -5;

		System.out.println(~(~var1));		// ~(~(5)) => ~(-6) => 5
		System.out.println(~var2);		// ~(-5) => 4
	}
}

/* Output
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p9.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p9.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ java Core2web 
5
4
*/
