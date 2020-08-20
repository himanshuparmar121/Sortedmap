// Q5. Write a Program to take marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//      Percentage >= 90%: Grade A
//      Percentage >= 80%: Grade B
//      Percentage >= 70%: Grade C
//      Percentage >= 60%: Grade D
//      Percentage >= 40%: Grade E
//      Percentage < 40%: Grade F

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Physics marks: ");
		int Phy_Mrks = Integer.parseInt(br.readLine());

		System.out.print("Enter Chemistry marks: ");
		int Chem_Mrks = Integer.parseInt(br.readLine());

		System.out.print("Enter Biology marks: ");
		int Bio_Mrks = Integer.parseInt(br.readLine());

		System.out.print("Enter Mathematics marks: ");
		int Math_Mrks = Integer.parseInt(br.readLine());

		System.out.print("Enter Computer marks: ");
		int Comp_Mrks = Integer.parseInt(br.readLine());

		float Percent = ((Phy_Mrks + Chem_Mrks + Bio_Mrks + Math_Mrks + Comp_Mrks) * 100) / 500;

		System.out.println("Percentage = " + Percent + "%");

		String Output = Percent >= 90 ? "Grade A" : Percent >= 80 ? "Grade B" : Percent >= 70 ? "Grade C" : Percent >= 60 ? "Grade D" : Percent >= 40 ? "Grade E" : "Grade F";

		System.out.println(Output);
		
	}
}
