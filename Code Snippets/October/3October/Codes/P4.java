import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s1 = br.readLine();
                String s2 = br.readLine();

                System.out.println(s1 + " " + s2);
        }
}
