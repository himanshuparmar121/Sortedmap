class Demo {

	public static void main(String[] args) {
	
		System.out.println(Integer.parseInt(args[0]));
	}
}

// The fact that, nothing exists at any index of args array, still we try to access element at 0th index will result in IndexOutOfBoundException
