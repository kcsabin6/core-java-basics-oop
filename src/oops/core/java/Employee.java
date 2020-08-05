package oops.core.java;

public class Employee {
	String name;
	int age;
	float salary;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


	Employee(){}
	
	
	Employee(String name, int age){
	this.name = name;
	this.age = age;
	System.out.println("Two parameter Constructor has been called");
	//System.out.println("Name = "+name+" age = "+age);
	}


	Employee(String name, int age, float salary){
	this.name = name;
	this.age =age;
	this.salary = salary;
	System.out.println("Three parameter Constructor has been called");
	//System.out.println("Name = "+name+" Age = "+age+" Salary = "+salary);
	}



/*public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("jack",23);
		Employee emp3 = new Employee("Miachel",21,4000);

	}*/

}
