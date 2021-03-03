package databaseMYSQL.Employee;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="employee_name")
public class Name {
	private String first_name;
	private String last_name;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	@Override
	public String toString() {
		return "Name [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}
