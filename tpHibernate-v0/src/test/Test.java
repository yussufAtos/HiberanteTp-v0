package test;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Product;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
		Session session = sessionFactory.openSession();
	
		  Transaction tx = null; 
		    try { 
		      tx = session.beginTransaction(); 
		      Product pr1 = new Product();
//		      pr.setNom("MAMADO");
//		      pr.setPrenom("DYALO");
		      
		      pr1.setNom("MAMADO");
		      pr1.setPrenom("DYALO");
	         session.save(pr1);
//		      session.merge(pr);
		      session.flush() ;
		      tx.commit();
		    } catch (Exception e) {
		      if (tx != null) {
		        tx.rollback();
		      }
		      throw e;
		    } finally { 
		      session.close(); 
		    } 
		    
		    sessionFactory.close(); 
		  } 
	
		
		
	
	
	}

