package com.aurionpro.dbconnect.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aurionpro.dbconnect.entities.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		TypedQuery<Customer> query=manager.createQuery("select c from Customer c",Customer.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		manager.merge(customer);
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return manager.find(Customer.class, customerId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Customer customer=manager.find(Customer.class,customerId);
		if(customer!=null) {
			manager.remove(customer);
		}
		
	}

}
