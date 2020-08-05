package treeSet;

public class Employee implements Comparable<Employee>{ //Comparable provides default sorting behaviour
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		int x= this.name.compareTo(e.name); //sort by name by default using compareTo() method
		//return this.id-e.id;
		return x;
	}
	
	

}
