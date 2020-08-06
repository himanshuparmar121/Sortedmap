class Human {

	public static void main(String[] args) {
	
		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();

		boolean isLionHuman = lion instanceof Human;
		System.out.println("Are Lion and Human of same species -->" + isLionHuman);
		boolean isTigerHuman = tiger instanceof Human;
		System.out.println("Are Tiger and Human of same species -->" + isTigerHuman);
		boolean isPumaHuman = puma instanceof Human;
		System.out.println("Are Puma and Human of same species -->" + isPumaHuman);
		boolean isMonkeyHuman = monkey instanceof Human;
		System.out.println("Are Monkey and Human of same species -->" + isMonkeyHuman);
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/22July$ vim p2.java
himanshu@himansh:~/java9/DailyFlash/22July$ javac p2.java
himanshu@himansh:~/java9/DailyFlash/22July$ java Human 
Are Lion and Human of same species -->false
Are Tiger and Human of same species -->false
Are Puma and Human of same species -->false
Are Monkey and Human of same species -->true
*/

/* Explanation:
 * The first line of Output is false because the instancof operator is used for checking whether lion is instance of class Human or not.
 * But there is written "Human lion = null" so, here lion is not made object of Human so the output is false.
 * It is same for tiger and puma, but the output is true for monkey as monkey is declared as the object for class Human and the value is true.
 */
