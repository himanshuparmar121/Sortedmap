// WAP to declare two variables, one in GrandParent class second in Parent classs and write addition() method in child class which prints the addition of those variables.(Use - Multilevel Inheritance)

class GrandParent {

	int var1 = 10;
}

class Parent extends GrandParent {

	int var2 = 20;
}

class Child {

	public static void main(String[] args) {
	
		Parent obj = new Parent();
		System.out.println("Addition = " + (obj.var1+obj.var2));
	}
}
