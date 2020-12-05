class Core2web {

	protected Core2web(String ... str) {
	
		System.out.println("IphoneOS");
	}

	private Core2web(String str) {
	
		System.out.println("OxygenOS");
	}

	Core2web() {
	
		System.out.println("HarmonyOS");
	}
	
	public static void main(String[] args) {
	
		new Core2web("");
		new Core2web(new String());
	}

}
