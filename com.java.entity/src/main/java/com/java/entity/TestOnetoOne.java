package com.java.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOnetoOne {
	public static void main(String args[]) {
		// deleteEmpAsset();
		addEmpAsset();
	}

	public static void deleteEmpAsset() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();
		EmployeeEntity emp = em.find(EmployeeEntity.class, 101);
		if (emp != null) {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			System.out.println("it removed from both the table");
		} else {
			System.out.println("no record found");
		}
	}

	public static void addEmpAsset() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit");
		EntityManager em = factory.createEntityManager();

		AssetEntity1 asset = new AssetEntity1();
		asset.setAid(106);
		asset.setAname("Lenovo");

		EmployeeEntity emp1 = new EmployeeEntity();
		emp1.setEid(106);
		emp1.setEname("Suresh");
		emp1.setAsset(asset);
		em.getTransaction().begin();
		em.persist(emp1);
		em.getTransaction().commit();
		System.out.println("its done");
	}
}
