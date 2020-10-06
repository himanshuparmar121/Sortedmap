class PalindromeNum {

	public static void main(String[] args) {
	
		int num = 121;
		int rem = 0, rev = 0;
		int dup = num;

		while(num != 0) {
		
			rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}

		if(rev == dup)
			System.out.println(dup + " is a palindrome number.");
		else
			System.out.println(dup + " is not a palindrome number.");
	}
}
