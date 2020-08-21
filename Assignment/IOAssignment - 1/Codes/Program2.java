import java.io.*;

class IPL {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String team = br.readLine();

		String Captain = br.readLine();

		float win_per = Float.parseFloat(br.readLine());

		int Ind_batsmen = Integer.parseInt(br.readLine());

		int Int_batsmen = Integer.parseInt(br.readLine());

		System.out.println("The IPL team name is: " + team);
		System.out.println("It's captain is: " + Captain);
		System.out.println("It has been win percentage of: " + win_per);
		System.out.println("Number of Indian Batsmen are: " + Ind_batsmen);
		System.out.println("Number of International Batsmen are: " + Int_batsmen);
	}
}
