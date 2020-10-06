import java.io.*;

class Core2web {

        public static void main(String strArr[]) throws Exception {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                br.skip(3);
                String str = br.readLine();

                System.out.println(str);
        }
}
