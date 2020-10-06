import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                char c = (char)br.readLine().charAt(0);
                String s = br.readLine();

                System.out.println(s);
        }
}
