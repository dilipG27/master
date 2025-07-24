package StringCode;

public class Employee {

	private String name;
	private int salary;
	private String lName;
	private String dept;

	
	public Employee(String name, int salary, String lName, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.lName = lName;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
