package com.jsp.vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VehicleDelete {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = entityManager.find(Vehicle.class, 3);

		if (vehicle != null) {
			entityTransaction.begin();
			entityManager.remove(vehicle);
			entityTransaction.commit();
		} else {
			System.out.println("not deleted");
		}
	}

}
