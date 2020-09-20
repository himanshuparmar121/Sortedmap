import java.io.*;

class InputOutputDemo {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String input1 = br.readLine();
		System.out.println(input1);
		
		String input2 = br.readLine();
		System.out.println(input2);

	//	br.close();
	//	isr.close();

		InputStreamReader isr1 = new  InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		
		String input3 = br1.readLine();
		System.out.println(input3);
	}
}

