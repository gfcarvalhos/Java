package entities;

public class Employee_list {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee_list(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(Double acrec) {
		this.salary += salary*(1+acrec)/100;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
