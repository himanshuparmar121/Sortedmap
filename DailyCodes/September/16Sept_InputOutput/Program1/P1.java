
import java.io.*;

class InputOutputDemo {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println(br.readLine());
	}
}
