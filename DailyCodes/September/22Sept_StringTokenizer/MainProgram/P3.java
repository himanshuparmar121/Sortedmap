
import java.io.*;
import java.util.*;

class Emp_Info {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String empDetails = br.readLine();
		StringTokenizer st = new StringTokenizer(empDetails, ", ");

		String token1 = st.nextToken();
		String token2 = st.nextToken();
		String token3 = st.nextToken();

		System.out.println("EmpId: " + token1);
		System.out.println("EmpName: " + token2);
		System.out.println("EmpSalary: " + token3);
	}
}
