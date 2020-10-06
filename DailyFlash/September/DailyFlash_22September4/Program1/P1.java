// Q. Take a class name IPLTeam, declare instance variable as String teamName, String catain, int jerseyNum, String franchiseOwner, int countOfTropiesWon.
// Now inside main() method take input from user make object of IPLTeam class, and assign each variable a respective value and print them...

import java.io.*;

class IPLTeam {

	String teamName, capt, franOwner;
	int jerNo, cntTrophieWon;

	public static void main(String[] args) throws IOException {
	
		IPLTeam ipl = new IPLTeam();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Team Name: ");
		ipl.teamName = br.readLine();

		System.out.println("Enter Captain Name:");
		ipl.capt = br.readLine();

		System.out.println("Enter jersery Number of Captain: ");
		ipl.jerNo = Integer.parseInt(br.readLine());

		System.out.println("Enter franchise Owner of the Team:");
		ipl.franOwner = br.readLine();

		System.out.println("Enter count of Trophies won by the team:");
		ipl.cntTrophieWon = Integer.parseInt(br.readLine());

		System.out.println("Team: " + ipl.teamName);
		System.out.println("Captain: " + ipl.capt);
		System.out.println("Jersey Number: " + ipl.jerNo);
		System.out.println("Franchise Owner of Team: " + ipl.franOwner);
		System.out.println("Number of Trophies Won: " + ipl.cntTrophieWon);
	}
}
