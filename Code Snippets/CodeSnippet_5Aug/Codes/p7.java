class Core2web {

	public static void main(String[] args) {
	
		int var1 = 10;

		int var2 = var1 == 10 ? var1++ : ++var1;

		System.out.println(var2);
	}
}

/* Output
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p7.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p7.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ java  Core2web 
10
*/
