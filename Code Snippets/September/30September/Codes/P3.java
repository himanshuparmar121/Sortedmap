import java.io.*;

class Core2web {

        public static void main(String arr[]) {

               
	       Core2web obj = new Core2web();
	       obj.getName();
	}

	void getName() throws IOException {

	       InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                br.skip(2);
                String name = br.readLine();
                System.out.println(name);
        }
}

