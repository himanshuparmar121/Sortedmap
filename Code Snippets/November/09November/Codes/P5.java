/* Assume both P6 and P7 are in same directory 
 *
 * P6.java
 * class Core2web {
 *
 * 	int var1 = 10;
 * 	public void showVar1() {
 *
 * 		System.out.println(++var1);
 * 	}
 * }
 *
 * P7.java
 * class Main {
 *
 * 	public static void main(String[] args) {
 *
 * 		Core2web c2w = new Core2web();
 *		System.out.println(c2w.var1);
 * 	}
 * }
 *
 * &> javac P6.java
 * &> javac P7.java
 * &> java Main
 *
 *
 * Ans: 10
 */
