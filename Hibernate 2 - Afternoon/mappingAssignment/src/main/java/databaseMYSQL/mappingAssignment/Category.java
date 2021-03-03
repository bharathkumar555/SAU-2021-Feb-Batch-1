package databaseMYSQL.mappingAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Category {
	@Id
	private int catId;
	private String catName;
	private String type;
	
	@OneToMany(mappedBy="category")
	private List<Product> product = new ArrayList<Product>();
	
	@ManyToMany
	private List<Supplier> supplier = new ArrayList<Supplier>();
	
	public List<Supplier> getSupplier() {
		return supplier;
	}
	public void setSupplier(List<Supplier> supplier) {
		this.supplier = supplier;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + ", type=" + type + "]";
	}
	
	
}
