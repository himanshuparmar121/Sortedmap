import java.io.*;

class ArrayDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		int iarr[] = new int[x];

		for(int i = 0; i < x; i++) {
		
			iarr[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < x; i++) {
		
			System.out.println(iarr[i]);
		}
	}
}
