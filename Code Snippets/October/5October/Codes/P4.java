import java.io.*;

class Core2web {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int var1 = br.read();
		int var2 = br.read();
		System.out.println(++var1 + var2++);
	}
}

// print the ascii value
