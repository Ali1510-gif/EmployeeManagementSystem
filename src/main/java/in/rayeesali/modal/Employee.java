package in.rayeesali.modal;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int sal;

	public Employee(int id, String name, String dept, int sal) {

		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	public Employee() {

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

	public String getDpt() {
		return dept;
	}

	public void setDpt(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}

}
