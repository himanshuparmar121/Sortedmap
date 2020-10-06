import java.io.*;

class Core2web {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char division = (char)br.read();
		System.out.println(division);
	} 
}
