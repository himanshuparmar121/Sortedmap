class Core2web {

	String var;

	Core2web(CharSequence var) {
	
		System.out.println("CharSequence Constructor");
		this.var = (String)var;
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web("Shashi");

		System.out.println(c2w.var);
	}
}
