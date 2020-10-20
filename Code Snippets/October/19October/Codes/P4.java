class Core2web {

	public static void main(String[] args) {
	
		Object[] var1 = new Core2web[3];
		var1[0] = new Core2web();
		var1[1] = new Core2web();

		if(var1[0] instanceof Core2web)
			System.out.println("Instance of Core2web");
		else
			System.out.println("Object Instance");
	}
}
