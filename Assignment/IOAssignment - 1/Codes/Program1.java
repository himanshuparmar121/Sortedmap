import java.io.*;

class Datatypes {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter String:");
		String input = br.readLine();
		
		System.out.println("Enter Integer:");
		int i = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Float:");
		float f = Float.parseFloat(br.readLine());

		System.out.println("Enter Double:");
		double d = Double.parseDouble(br.readLine());

		System.out.println("Enter Long:");
		long l = Long.parseLong(br.readLine());

		System.out.println("Enter Boolean:");
		boolean b = Boolean.parseBoolean(br.readLine());

		System.out.println("Enter Char:");
		char ch = (char)br.read();


		System.out.println(input);
		System.out.println("Int = " + i);
		System.out.println("Float = " + f);
		System.out.println("Double = " + d);
		System.out.println("Long = " + l);
		System.out.println("Boolean = " + b);
		System.out.println("Char = " + ch);
	}
}
