import java.util.GregorianCalendar();

class DiffBuilderBuffer {

	public static void main(String[] args) {
	
		long startTime = new GregorianCalender().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();

		StringBuffer sb1 = new StringBuffer("Shashi");
		//StringBuffer sb2 = new StringBuffer("Biencaps");
		
		for(int i = 0; i < 10000000; i++) {
		
			sb1.append("Hello");
			//sb2.append("Hello");
		}

		long endTime = new GregorianCalender().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();

		System.out.println("Time = " + (endTime - startTime));
		System.out.println("Memory = " + (endMemory - startMemory));
	}
}
