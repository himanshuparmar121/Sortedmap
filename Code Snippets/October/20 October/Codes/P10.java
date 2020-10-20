class Animals {

	String animalName;

	Animals(String animalName) {
	
		this.animalName = animalName;
	}
}

class Core2web {

	public static void main(String arr[]) {
	
		Animals arrAnimals[] = {new Animals("Tiger"), new Animals("Lion")};

		System.out.println(arrAnimals[0]);
	}
}
