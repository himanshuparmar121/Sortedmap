import java.io.*;

class PlayerInfo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Player Info:");
                int jerNo = Integer.parseInt(br.readLine());
                char grade = (char) br.read();
                br.skip(1);
		String name = br.readLine();
                double avg = Double.parseDouble(br.readLine());

                System.out.println("Jersey No: " + jerNo);      // 07
                System.out.println("Grade: " + grade);          // A
                System.out.println("Name: " + name);            // M.S. Dhoni
                System.out.println("Average: " + avg);          //67.4
        }
}
