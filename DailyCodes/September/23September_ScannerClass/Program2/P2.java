import java.util.*;

class ScannerDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		char c = sc.next().charAt(0);
		double d = sc.nextDouble();

		System.out.println(x);
		System.out.println(c);
		System.out.println(d);
	}
}
