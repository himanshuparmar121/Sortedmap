// Using equals method, considers 2 strings as equal only if they have the same case sensitive sequence of characters.

class Program {

	public static void main(String[] args) {
	
		String s1 = "Himanshu";
		String s2 = "HimanSHU";

		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
