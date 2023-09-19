package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {
public static void main(String[] args) {
	
	// connection
			EntityManagerFactory entityManagerFactory = 
					Persistence.createEntityManagerFactory("thejzany");

			// DB operations
			EntityManager entityManager = 
					entityManagerFactory.createEntityManager();

			String sql="SELECT e FROM Employee e";//HQL query
			
			Query query = entityManager.createQuery(sql);//custom query with return type Query
			
			List<Employee> employees = query.getResultList();// we get multiple outputs here and we store it in list
			
			for( Employee e : employees){
				System.out.println("=========");
				System.out.println(e.getId());
				System.out.println(e.getName());
				System.out.println(e.getEmail());
				System.out.println(e.getCno());
				System.out.println("==============");
					
			}
}
}
