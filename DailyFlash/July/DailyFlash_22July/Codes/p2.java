/*Ques. 2: Write 2 classes on instagram & Facebook. Write one static method, one instance method in instragram class, static method should check the object belongs to class Instagram or not using a 
 * 	   ternary operator call that method on the class name and pass object of the instagram class. Write the main method in the Facebook class and create on Instagram object and also draw JVM architecture.
 */

class Instagram {

	int ActUsers = 13;

	void ShowActiveUsers() {
	
		System.out.println("Active Number of Users = " + ActUsers);
	}

	static void ShowObject(Instagram I) {
	
		System.out.println("Does object belong to Class Instagram = ");
		System.out.println(I instanceof Instagram);
	}
}

class Facebook {

	public static void main(String[] args) {
	
		Instagram users = new Instagram();
		users.ShowActiveUsers();
		Instagram.ShowObject(users);
	}
}

/*  Output
himanshu@himansh:~/java9/DailyFlash/22July$ javac p2.java
himanshu@himansh:~/java9/DailyFlash/22July$ java Facebook 
Active Number of Users = 13
Does object belong to Class Instagram = 
true
*/
