import java.io.*;

class StringLength {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a String :: ");
		String str = br.readLine();

		for(int i = 0; i < str.length(); i++) {
		
			System.out.println(str.charAt(i));
		}
	}
}
