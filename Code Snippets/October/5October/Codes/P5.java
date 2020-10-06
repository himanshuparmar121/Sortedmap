import java.io.*;

class Core2web {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		String var1 = new String();

		var1 = var1 + br.read();
		var1 = var1 + (char)br.read();
		System.out.println(var1);
	}
}

// read() reads character by character from the buffer, and therefore first it will read '8', but it return ASCII of the character it will reaturn 56. 
// Now second call will read '3', but we are typecasting it char, it will get as it is and it is added to String, final String formed will be 563.

