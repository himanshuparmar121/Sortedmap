/* A B
 * A B C
 * A B C D
 * A B C D E
 * A B C D E F
 */

class Program {

	public static void main(String[] args) {
	
		for(int i = 0; i < 5; i++) {
		
			char c = 'A';

			for(int j = -1; j <= i; j++)
				System.out.print(c++ + " ");

			System.out.println();
		}
	}
}
