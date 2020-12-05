class Company {

	String cmpName;

	Company(String cmpName) {
	
		this.cmpName = cmpName;
	}

	class Employee {
	
		String name;
		long salary;
		String desgn;

		Employee(String name, long salary, String desgn) {
		
			this.name = name;
			this.salary = salary;
			this.desgn = desgn;
		}

		void info() {
		
			System.out.println("Company Name = " + cmpName);
			System.out.println("Employee Name = " + name);
			System.out.println("Employee Salary = " + salary);
			System.out.println("Employee Designation = " + desgn);
		}
	}
}

class Main {

	public static void main(String[] args) {
	
		Company obj1 = new Company("VmWare");
		Company.Employee obj = obj1.new Employee("Himanshu", 600000, "Senior Software Engineer");
		obj.info();
	}
}
