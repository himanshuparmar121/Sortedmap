class RTO {

	public static void main(String[] args) {
	
		String code = "AP";
		System.out.println("RTO code : " + code);

		switch(code) {
		
			case "AP" :
				System.out.println("State name : Arunachal Pradesh");
				break;
			case "MH" :
				System.out.println("State name : Maharastra");
				break;
			case "RJ" :
				System.out.println("State name : Rajasthan");
				break;
			case "TN" :
				System.out.println("State name : Tamil Nadu");
				break;
			case "GJ" :
				System.out.println("State name : Gujarat");
				break;
		}
	}
}

/* Output

himanshu@himansh:~/java9/DailyFlash/29July/Codes$ vim Program3.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ javac Program3.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ java RTO 
RTO code : AP
State name : Arunachal Pradesh
*/
