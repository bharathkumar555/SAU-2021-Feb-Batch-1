package databaseMYSQL.mappingAssignment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Category catg_shoe = new Category();
    	Category catg_mobile = new Category();
    	Supplier supp1 = new Supplier();
    	Supplier supp2 = new Supplier();
    	
    	supp1.setSuppId(258);
    	supp1.setSuppName("Arun traders");
    	supp1.setSuppPhone("7896541236");
    	
    	supp2.setSuppId(759);
    	supp2.setSuppName("ravi traders");
    	supp2.setSuppPhone("9874563214");
    	
    	Supplier supp3 = new Supplier();
		supp3 .setSuppId(746);
    	supp3.setSuppName("rahul electronics");
    	supp3.setSuppPhone("9874563214");
    	
    	List <Supplier> sList = new ArrayList<Supplier>();
    	sList.add(supp1);
    	sList.add(supp2);
    	
    	List <Supplier> sList1 = new ArrayList<Supplier>();
    	sList1.add(supp2);
    	sList1.add(supp3);
    	
    	List<Category> cat = new ArrayList<Category>();
    	cat.add(catg_mobile);
    	cat.add(catg_shoe);
    	
    	supp1.setCatagorySupp(cat);
    	supp2.setCatagorySupp(cat);
    	
    	catg_shoe.setSupplier(sList);
    	catg_mobile.setSupplier(sList1);
    	
    	Product prod = new Product();
        prod.setProdId(123);
        prod.setProdName("nike");
        prod.setPrice(2000);
        prod.setCategory(catg_shoe);
        
        Product pro = new Product();
        pro.setProdId(25);
        pro.setProdName("reebok");
        pro.setPrice(4500);
        pro.setCategory(catg_shoe);
        
        Product p1 = new Product();
        p1.setProdId(741);
        p1.setProdName("Samsung");
        p1.setPrice(45000);
        p1.setCategory(catg_mobile);
        
        Product p2 = new Product();
        p2.setProdId(861);
        p2.setProdName("Apple");
        p2.setPrice(100000);
        p2.setCategory(catg_mobile);
        
        List<Product> p = new ArrayList<Product>();
        p.add(prod);
        p.add(pro);
        
        List<Product> p3 = new ArrayList<Product>();
        p3.add(p1);
        p3.add(p2);
        
        
        //catg.getProduct().add(prod);
        catg_shoe.setProduct(p);
        catg_shoe.setCatId(456);
        catg_shoe.setCatName("Fashion");
        catg_shoe.setType("Shoes");
        
        catg_mobile.setProduct(p3);
        catg_mobile.setCatId(100);
        catg_mobile.setCatName("Mobile");
        catg_mobile.setType("TouchScreen");
        
    	Configuration conn = new Configuration().configure().addAnnotatedClass(Category.class).addAnnotatedClass(Product.class).addAnnotatedClass(Supplier.class);
        SessionFactory sf =  conn.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
   
        session.save(catg_shoe);
        session.save(catg_mobile);
        session.save(prod);
        session.save(pro);
        session.save(p1);
        session.save(p2);
        session.save(supp1);
        session.save(supp2);
        session.save(supp3);

        session.getTransaction().commit();
    }
}
