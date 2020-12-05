class Core2web {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Core2web var1 = new Core2web();
		Core2web var2 = (Core2web)var1.clone();

		System.out.println(System.identityHashCode(var1) + " " + System.identityHashCode(var2));
	}
}
