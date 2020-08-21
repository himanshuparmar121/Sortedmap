// Q2. Write a Program tthat takes electricity unit charges as input and calculate total electricity bill according to the given condition:
// For 1st 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 units Rs. 1.50/unit

import java.io.*;

class Bill {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter unit: ");
		int unit = Integer.parseInt(br.readLine());

		double rs = 0;

		if(unit <= 50) {

        	        rs = 0.50 * unit;
	                System.out.println("Total bill - Rs: " + rs);
        	} else if(unit <= 100 && unit > 50) {

                	rs = 0.75 * unit;
                	System.out.println("Total bill - Rs: " + rs);
        	} else if(unit > 100 && unit <= 250) {

                	rs = 1.20 * unit;
                	System.out.println("Total bill - Rs: " + rs);
        	} else {

                	rs = 1.50 * unit;
                	System.out.println("Total bill - Rs: " + rs);
        	}

	}
}
