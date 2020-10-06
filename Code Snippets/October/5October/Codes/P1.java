import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Float f = Float.parseFloat(br.readLine());

		if(f == 1.1)
			System.out.println(true);
		else
			System.out.println(false);
	}
}

/*
 * 1.1 is stored as double so it can't be as same as float value, it should be written as 1.1f to be same .
 */
