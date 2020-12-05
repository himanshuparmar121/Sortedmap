// WAJP for login window . Write one class, define hardcoded username & password. Then write one parameterised constructor in class to take username & password & match that credentials with the
// hardcodoed values oif values matches print 'ogn successful'. Otherwise print invalid User.

class Login {

	String username = "parmarHimanshu";
	String password = "@himanshu";

	Login() {
	
		System.out.println("Enter username & password!!!");
	}

	Login(String userName, String passWord) {

		if((userName == username) && (passWord == password)) {
		
			System.out.println("Login Successful");
		} else {
		
			System.out.println("Invalid User");
		}
	}

	public static void main(String[] args) {
	
		Login obj1 = new Login("parmarHimanshu", "@himanshu");
		Login obj2 = new Login("parmarhimanshu", "@himanshu");
	}
}
