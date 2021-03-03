package databaseMYSQL.Employee;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int choice;
        
        Configuration conn = new Configuration().configure().addAnnotatedClass(EmployeeData.class);
        SessionFactory sf =  conn.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tf = session.beginTransaction();
        Scanner sc= new Scanner(System.in);         
        
        do {
        	System.out.println("**************************************************************");
        	System.out.println(" Choose from the menu");
        	System.out.println("**************************************************************\n");
        	System.out.println("1. Insert Employee");
        	System.out.println("2. Increment salary of all employees(update all)");
        	System.out.println("3. update indivual salary");
        	System.out.println("4. Delete employee records");
        	System.out.println("5. Display all Employee");
        	System.out.println("6. Display emloyee by Id");
        	System.out.println("7. Exit\n");
        	System.out.print("Enter your choice:- ");
        	choice = sc.nextInt();
        	switch(choice) {
        	case 1 : 
        		addEmployee(session);
                tf.commit();
                break;
                
        	case 2:
        		incrementSalary(session);
        		break;
        		
        	case 3:
        		updateSalaryById(session);
        		break;
        	
        	case 4:
        		deleteEmployeeById(session);
        		break;
        		
        	case 5:
        		displayAllEmployee(session);
        		break;
        		
        	case 6:
        		getEmployeeById(session);
        		break;
        		
        	case 7:
        		System.out.println("Exiting the Menu");
        		break;
                
        	default :
        		System.out.println("Enter a number between 1 to 6");
        	}        
        } while(choice != 7); 
        
        session.close();
    }

	private static void deleteEmployeeById(Session session) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID to delete: ");
		int empId = sc.nextInt();
		
		Query query2=session.createQuery("delete from EmployeeData where emp_id=:empId");
		query2.setParameter("empId", empId);
		int deleted =query2.executeUpdate();
		if(deleted>0) {
		System.out.println(deleted+" number of records were deleted");}
		
	}

	private static void updateSalaryById(Session session) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID to update: ");
		int emp_id = sc.nextInt();
		
		System.out.println("Enter new employee salary : ");
		double salary = sc.nextDouble();
		
		Query query=session.createQuery("update EmployeeData e set e.salary=:salary where e.emp_id=:emp_id");
		query.setParameter("salary", salary);
		query.setParameter("emp_id", emp_id);
		int modifications=query.executeUpdate();
		if (modifications > 0) {
		System.out.println(modifications+" number of records were modified");}
		else {
			System.out.println("No matching Employee Id found");
		}
		
	}

	private static void getEmployeeById(Session session) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeData emp = null;
		System.out.println("Enter the Employee Id : ");
		int fetchId = sc.nextInt();
		emp = (EmployeeData) session.get(EmployeeData.class, fetchId);
		if(emp == null) {
			System.out.println("\nThere are no employees with this Id : "+fetchId+"\n");
		} else {
			System.out.println(emp);
		}
		
	}

	private static void incrementSalary(Session session) {
		System.out.println("Incerasing the salary of employees by 10%");
		Query query1 = session.createQuery("update EmployeeData e set e.salary=e.salary + (0.1*e.salary)");
		int modification = query1.executeUpdate();
		System.out.println(modification+" number of records were modified.");
	}
	
	@SuppressWarnings("unchecked")
	private static void displayAllEmployee(Session session){
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(EmployeeData.class);
		List<EmployeeData> employees = criteria.list();

		Iterator<EmployeeData> itr = employees.iterator();
		while (itr.hasNext()) {

			EmployeeData emp = (EmployeeData) itr.next();
			System.out.println(emp);
		}  
	}
	
	private static void addEmployee(Session session) {
		Name emp_1_name = new Name();
		EmployeeData emp_1 = new EmployeeData();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of new employee : ");
		        		
		System.out.println("Enter employee firstname : ");
		long then = System.currentTimeMillis();
        String line = sc.nextLine();
        long now = System.currentTimeMillis();
		emp_1_name.setFirst_name(line);
		
		System.out.println("Enter employee lastname : ");
		emp_1_name.setLast_name(sc.nextLine());
		emp_1.setName(emp_1_name);
		
		System.out.println("Enter employee Date of birth : ");
		emp_1.setDOB(sc.nextLine());
		
		System.out.println("Enter employee Age : ");
		emp_1.setAge(sc.nextLine());
		
		System.out.println("Enter employee Designation : ");
		emp_1.setDesignation(sc.nextLine());
		
		System.out.println("Enter employee ID : ");
		emp_1.setEmp_id(sc.nextInt());
		
		System.out.println("Enter employee salary : ");
		emp_1.setSalary(sc.nextDouble());
        
        session.save(emp_1);
	}

	
}
