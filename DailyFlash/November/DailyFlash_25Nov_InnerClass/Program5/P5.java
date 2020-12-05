class Building {

	static String buildingName;
	int noOfFlats;

	Building(String name, int nof) {
	
		buildingName = name;
		noOfFlats = nof;
	}

	class Flat {
	
		int noOfRooms;
		int noOfBalcony;

		Flat(int nor, int nob) {
		
			noOfRooms = nor;
			noOfBalcony = nob;
		}

		void PrintValues() {
		
			System.out.println("No Of Rooms = " + noOfRooms);
			System.out.println("No Of Balcony = " + noOfBalcony);
		}
	}

	void PrintValues() {

		System.out.println("Building Name = " + buildingName);
		System.out.println("No Of Flats = " + noOfFlats);
	}
}

class Main {

	public static void main(String[] args) {
	
		Building obj = new Building("6th Sense", 28);
		obj.PrintValues();
		Building.Flat obj1 = obj.new Flat(2,3);
		obj1.PrintValues();
	}
}
