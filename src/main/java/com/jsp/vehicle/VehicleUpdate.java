package com.jsp.vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VehicleUpdate {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 4);
		vehicle.setModel("gls");
		
		entityTransaction.begin();
		entityManager.merge(vehicle);
		entityTransaction.commit();
		
		
	}
}
