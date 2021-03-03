package databaseMYSQL.mappingAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Supplier {
	@Id
	private int suppId;
	private String suppName;
	private String suppPhone;
	
	@ManyToMany(mappedBy="supplier")
	private List<Category> catagorySupp = new ArrayList<Category>();
	
	public List<Category> getCatagorySupp() {
		return catagorySupp;
	}
	public void setCatagorySupp(List<Category> catagorySupp) {
		this.catagorySupp = catagorySupp;
	}
	public int getSuppId() {
		return suppId;
	}
	public void setSuppId(int suppId) {
		this.suppId = suppId;
	}
	public String getSuppName() {
		return suppName;
	}
	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}
	public String getSuppPhone() {
		return suppPhone;
	}
	public void setSuppPhone(String suppPhone) {
		this.suppPhone = suppPhone;
	}
	
	@Override
	public String toString() {
		return "Supplier [suppId=" + suppId + ", suppName=" + suppName + ", suppPhone=" + suppPhone + "]";
	}
	
	
}
