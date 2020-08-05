class Core2web {

	public static void main(String[] args) {
	
		int var1 = 0;
		int var2 = 0;
		for(int var3 = 0; var3 < 5; ++var3) {
		
			if((++var1 > 2) && (++var2 > 2)) {
			
				var1++;
			}
		}
		System.out.println(var1 + " " + var2);
	}
}

/* Output
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ vim p4.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ javac p4.java
himanshu@himansh:~/Sortedmap/Code Snippets/CodeSnippet_5Aug/Codes$ java Core2web 
6 3
*/
