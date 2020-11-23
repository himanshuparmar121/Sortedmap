// WAP using StringBuffer "Aquaman" to delete the substring: ma

class Program {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Aquaman");

		sb.delete(4,6);
		System.out.println(sb);
	}
}
