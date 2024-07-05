package com.model;
import org.hibernate.*;

public class DKExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Transaction tr=null;
        try(Session ses=HBUTIL2.getSessionFactory().openSession())
        {
        	tr=ses.beginTransaction();
        	Employee e1=new Employee("Siva");
        	RegularEmployee e2=new RegularEmployee("Dhanush",5500,2000);
        	Trainee e3=new Trainee("kugan",200,"6 months");
        	
        	ses.persist(e1);ses.persist(e2);ses.persist(e3);
        	tr.commit();
        	ses.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        
	}

}
