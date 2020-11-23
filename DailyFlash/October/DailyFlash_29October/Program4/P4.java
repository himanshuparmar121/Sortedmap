/* Write an interface Team in which there are methods getPlayerNum and getPlayerName to display player number and name respectively, and a default method to print the number of wins and losses by that team.
 * (by default win  = 0 and losses  = 0). Use this interface and create different classes and print the output from main method.
 */

interface Team {

	void getPlayerNum();
	void getPlayerName();
	void win_loss();
}

class CSK implements Team {

	public void getPlayerNum() {
	
		System.out.println("Number of Player: 07");
	}

	public void getPlayerName() {
	
		System.out.println("Name of Player: M.S. Dhoni");
	}

	public void win_loss() {
	
		System.out.println("Wins: 5");
		System.out.println("Loss: 3");
	}
}

class MI implements Team {

	public void getPlayerNum() {
	
		System.out.println("Number of Player: 10");
	}

	public void getPlayerName() {
	
		System.out.println("Name of Player: Rohit Sharma");
	}

	public void win_loss() {
	
		System.out.println("Wins: 7");
		System.out.println("Loss: 1");
	}
}

class Main {

	public static void main(String[] args) {
	
		Team t1 = new CSK();
		t1.getPlayerNum();
		t1.getPlayerName();
		t1.win_loss();
		
		Team t2 = new MI();
		t2.getPlayerNum();
		t2.getPlayerName();
		t2.win_loss();
	}
}
