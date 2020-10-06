import java.io.*;

class Core2web {

	public static void main(String[] args) {
	
		try {
		
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
		} catch(IOException obj) {
		
			System.out.println("IOException occurred");
		}

		char tier = br.read();
		System.out.println(tier);
	}
}
