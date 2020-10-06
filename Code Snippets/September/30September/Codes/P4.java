import java.io.*;

class Core2web {

        public static void main(String arr[]) throws IOException {

               Core2web obj = new Core2web();
	       obj.getSalary();
	}

	void getSalary() throws IOException {

	       	InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

		double salary = Double.parseDouble(br.readLine());
                System.out.println(salary);
        }
}

