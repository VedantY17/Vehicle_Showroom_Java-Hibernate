package com.jsp.vehicle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VehicleGetAll {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "SELECT v FROM Vehicle v";
		Query query = entityManager.createQuery(sql);
		
		List<Vehicle> vehicles = query.getResultList();
		
		for(Vehicle v : vehicles) {
			System.out.println("================");
			System.out.println(v.getId());
			System.out.println(v.getBrand());
			System.out.println(v.getModel());
			System.out.println(v.getPrice());
			System.out.println("================");
		}
	}

}
