// Using "==" operator check the reference of the variables. In other words, checks if both objects point to the same memory location or not.

class Program {

	public static void main(String[] args) {
	
		String s1 = "Core2web";
		String s2 = "Core2web";
		String s3 = new String("Core2web");

		if(s1 == s2)
			System.out.println("s1 & s2 points to the same memory loactions.");
		else if(s2 == s3)
			System.out.println("s2 & s3 points to the same memory loactions.");
		else 
			System.out.println("None of the String points to the same location.");
	}
}
