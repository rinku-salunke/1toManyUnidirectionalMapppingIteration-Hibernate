package com.client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Department;
import com.model.Employee;

public class Test {

public static void main(String[] args)  {
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	System.out.println("...By Using Iterator Method...");
	
	Transaction tr= session.beginTransaction();
	
	Department d=session.get(Department.class, 102);
	
	Set<Employee> e=new HashSet<>();

	Set<Department> r=new HashSet<>();
	
	
	Iterator<Department> itr=r.iterator();
	
	while(itr.hasNext()) {
		
		Department k=itr.next();
		System.out.println(k.getDid());
			System.out.println(k.getDname());	
			
	}
	tr.commit();	
}
}

