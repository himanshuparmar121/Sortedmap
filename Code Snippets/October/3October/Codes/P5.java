import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s1 = br.readLine();
                Float f = Float.parseFloat(br.readLine());

                System.out.println(f + " " + s1);
        }
}

