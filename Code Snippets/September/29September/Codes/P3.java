
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Core2web {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int highScore = br.readLine();
		System.out.println(highScore);
	}
}
