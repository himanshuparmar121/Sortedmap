import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s1 = br.readLine();
                Integer f = Integer.parseInt(br.readLine());

                System.out.println(s1 + " " + f);
        }
}
