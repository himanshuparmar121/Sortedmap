class IPL {

	void match() {
	
		System.out.println("Match");
	}

	public static void main(String[] args) {
	
		IPL ipl = new IPL();
		ipl.match();
		System.out.println(ipl.getClass());
	}

}
