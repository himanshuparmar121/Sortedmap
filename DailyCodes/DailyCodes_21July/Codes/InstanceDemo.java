class Cricket {

	public static void main(String[] args) {
	
		Cricket test = new Cricket();
		Cricket oneDay = new Cricket();
		Cricket t20 = new Cricket();
		Cricket thirty5 = null;

		boolean res;
		res = test instanceof Cricket;

		System.out.println(res);
		System.out.println(oneDay instanceof Cricket);
		System.out.println(t20 instanceof Cricket);
		System.out.println(thirty5 instanceof Cricket);
	}
}

/*  Output
himanshu@himansh:~/java9/July/21July$ vim InstanceDemo.java
himanshu@himansh:~/java9/July/21July$ javac InstanceDemo.java
himanshu@himansh:~/java9/July/21July$ java Cricket 
true
true
true
false
*/
