// Q. Take number of overs from user. Calculate the total number of balls by the value of total overs and create an array of runs of size of calculated number of total balls. 
// (if overs are 2 then take array of size 12). Take runs from the user. Then print the following:
// 1. Total Score
// 2. Total numbers of balls
// 3. Total numbers of Sixes(i.e 6)
// 4. Total Number of Fours(i.e 4)
// 5. Total numbers of others(i.e 1, 2 or 3)

import java.io.*;

class Cricket {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No. of Overs: ");
		int ovr = Integer.parseInt(br.readLine());

		int balls = 6 * ovr;
		int runs[] = new int[balls];
		int ttl = 0, four = 0, six = 0, othr = 0;

		System.out.println("Enter Runs: ");
		for(int i = 0; i < runs.length; i++) {
		
			runs[i] = Integer.parseInt(br.readLine());
			ttl += runs[i];

			if(runs[i] == 4)
				four++;
			else if(runs[i] == 6)
				six++;
			else
				othr++;
		}

		System.out.println("Total Score: " + ttl);
		System.out.println("Total Numbers of balls: " + runs.length);
		System.out.println("Total Numbers of Sixes: " + six);
		System.out.println("Total Numbers of fours: " + four);
		System.out.println("Total Numbers of others(i.e 1, 2 or 3): " + othr);
	}
}
