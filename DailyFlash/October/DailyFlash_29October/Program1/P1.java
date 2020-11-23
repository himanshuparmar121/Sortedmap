/* Write a class TV with method turnOn with one parameter tvRemote of type boolean and a method turnOn with two parameters both bool type: 
 * tvRemote and setupBox. Pass the values(True/False) and print whether the tv is on or not.
 */

class TV {

	void turnOn(boolean tvRemote) {
	
		if(tvRemote == true)
			System.out.println("TV is ON");
		else
			System.out.println("TV is OFF");
	}

	void turnOn(boolean tvRemote, boolean setupBox) {
	
		if(tvRemote == true && setupBox == true)
			System.out.println("TV is ON");
		else
			System.out.println("TV is OFF");
	}

	public static void main(String[] args) {
	
		TV output = new TV();
		output.turnOn(true);
		output.turnOn(true, false);
	}
}
