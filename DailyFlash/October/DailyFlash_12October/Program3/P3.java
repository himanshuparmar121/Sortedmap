// Store one hardcoded string, in String literal and another hardcoded string in, string object. And comment how they are stored on String constant pool and heap.

class StringDemo {

	public static void main(String[] args) {
	
		String s1 = new String("Core2web");	// This will get store in Heap section with reference, because object is made of it and in SCP without reference.
		String s1 = "Core2web";			// It get stored in SCP (System Constant Pool).
	}
}
