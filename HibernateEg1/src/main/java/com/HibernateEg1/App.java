package com.HibernateEg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory s=new Configuration().configure().buildSessionFactory();
        //Configuration -activates hibernate framework
        //Configure-read both cfg files and mapping details
        //buildSessionFactory-from cfg object it takes jdbc information and create a jdbc connection
        
        Session ses=s.openSession();
        Transaction t=ses.beginTransaction();
        Student s1=new Student();
        s1.setStuId(101);
        s1.setStuFirstName("Akshaya");
        s1.setStuLastName("Dash");
        s1.setStuEmail("akshaya.dash1@gmail.com");
        s1.setStuPhone(991245656);
        s1.setStuAddr("Odisha");
        s1.setStuFee(1230.00);
        //Session object is used to save the persistent object
        ses.save(s1);
        //transaction object to commit changes
        t.commit();
    }
}