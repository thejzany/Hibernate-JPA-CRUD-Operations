package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		// all this in DAO
		// getting info from persistence file passing it to entity manager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("thejzany");

		// all the methods for all the DB operations
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// key-to start or to stop - commit part
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = new Employee();
		employee.setName("BittuuuMansuuu");
		employee.setEmail("bm@mail.com");
		employee.setCno(9892981996l);

		// step 1-begin
		entityTransaction.begin();

		// accepts only @entity type of object
		entityManager.persist(employee);

		// commit(action)
		entityTransaction.commit();
	}
}
