// In java, There is given a byte array and passed that byte array to the particular String class constructor and print the output like ABCDE
// Note:- Only use byte array and print the output ABCDE

class ByteDemo {

	public static void main(String[] args) {
	
		byte carr[] = {100, 101, 102, 103, 104};
		String s1 = new String(carr);
		System.out.println(s1);
	}
}
