
import java.io.*;

class ConnectionBuffer {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(br.readLine());
		System.out.println(br.readLine());

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(br.readLine());
		
		br1.close();
	}
}
