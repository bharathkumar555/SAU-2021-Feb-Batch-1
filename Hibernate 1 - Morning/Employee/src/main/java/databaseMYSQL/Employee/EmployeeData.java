package databaseMYSQL.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class EmployeeData {
	
	@Id
	private int emp_id;
	private Name name;
	@Column(length = 2)
	private String age;
	private double salary;
	private String DOB;
	private String Designation;
	
	public int getEmp_id() {
		return emp_id;
	}
	@Override
	public String toString() {
		return "\nEmployeeData [\nemp_id=" + emp_id + ",\nname=" + name + ",\nage=" + age + ",\nsalary=" + salary + ",\nDOB="
				+ DOB + ",\nDesignation=" +Designation + "]\n";
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
	

}
