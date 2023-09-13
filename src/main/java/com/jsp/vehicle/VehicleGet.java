package com.jsp.vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VehicleGet {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 2);
		
		System.out.println(vehicle.getId());
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.getModel());
		System.out.println(vehicle.getPrice());
		

	}
}
