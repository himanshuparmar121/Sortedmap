
import java.io.*;

class InputOutputDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input1 = br.readLine();
		System.out.println(input1);
		
		String input2 = br.readLine();
		System.out.println(input2);

		System.out.println(input1);
	}
}
