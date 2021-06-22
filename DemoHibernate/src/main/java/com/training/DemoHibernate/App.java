package com.training.DemoHibernate;

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

    	AlienHb a1=null;
    	Configuration con =new Configuration().configure().addAnnotatedClass(AlienHb.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session =sf.openSession();
    	Transaction tx=session.beginTransaction();
    	a1=(AlienHb)session.get(AlienHb.class,101);
    	System.out.println(a1);
    	tx.commit();
    }
}
