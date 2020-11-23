/* WAP using StringBuffer to show the difference between the following methods: length() and capacity() for 2 objects:
 * 1. Created using default constructor
 * 2. Created using parameterized constructor (java.lang.String)
 * Input: Core2web
 * Output: 
 * Sb1 length is 0
 * Sb1 length is 16
 * Sb2 length is 8
 * Sb2 length is 24
 */

class Program {

	StringBuffer sb1 = new StringBuffer();

	Program() {
	
	}

	Program(StringBuffer str) {
	
		sb1 = str;	
	}

	void strLen() {
	
		System.out.println("sb1 length: " + sb1.length());
	}

	void strCap() {
	
		System.out.println("sb1 capacity: " + sb1.capacity());
	}

	public static void main(String args[]) {

		StringBuffer sb = new StringBuffer("Core2web");

		Program p1 = new Program();
		p1.strLen();
		p1.strCap();

		Program p2 = new Program(sb);
		p2.strLen();
		p2.strCap();
	}
}
