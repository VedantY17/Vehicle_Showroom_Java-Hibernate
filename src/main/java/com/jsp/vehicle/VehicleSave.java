package com.jsp.vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VehicleSave {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("audi");
		vehicle.setModel("9series");
		vehicle.setPrice(560000);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
		
	}

}
