//Output and reason:

class ConstructorDemo {

	int rollNum;
 	ConstructorDemo() {

 		rollNum = 100;
  	}

 	ConstructorDemo(int rnum) {

 		this();
 		rollNum = rollNum + rnum;
 	}

 	int getRollNum() {
	
		return rollNum;
 	}

 	void setRollNum(int rollNum) {
	
		this.rollNum = rollNum;
 	}

 	public static void main(String[] args) {
	
		ConstructorDemo obj = new ConstructorDemo(12);
		System.out.println(obj.getRollNum());
 	}
}

// Explanation
// Here in the above code when the main method is executed and the object is created then the call goes to parameterised contructor and
// in parameterised constructor the first line is call to default constructor ie., this(), and in that rollNum is initialised by value 100.
// Then we give the parameter of constructor as rnum and it is initialised by 12 , then in the next line of paramterised cnstructor rollNum is assigned 
// by the addition of rollNum and rnum ie., 112. then the getRollNum() is call which returns the value of rollNum
// So, 112 get printed.
