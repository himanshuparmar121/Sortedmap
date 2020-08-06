// Write a java real time example using instanceof operator and also draw JVM architecture.

class TV {

	public static void main(String[] args) {
	
		TV philips = new TV();
		TV mi = new TV();
		TV hp = null;
		TV lenovo = null;

		boolean res1, res2;

		res1 = philips instanceof TV;
		res2 = hp instanceof TV;

		System.out.println("Does philips is instance of TV = " + res1);
		System.out.println("Does hp is instance of TV = " + res2);
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/22July$ vim p5.java
himanshu@himansh:~/java9/DailyFlash/22July$ javac p5.java
himanshu@himansh:~/java9/DailyFlash/22July$ java TV
Does philips is instance of TV = true
Does hp is instance of TV = false
*/
