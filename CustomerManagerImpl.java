package com.howtodoinjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.dao.CustomerDAO;
import com.howtodoinjava.entity.CustomerEntity;

@Service
public class CustomerManagerImpl implements CustomerManager {
	
	@Autowired
    private CustomerDAO customerDAO;

	@Override
	@Transactional
	public void addCustomer(CustomerEntity customer) {
		customerDAO.addCustomer(customer);
	}

	@Override
	@Transactional
	public List<CustomerEntity> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer customerId) {
		customerDAO.deleteCustomer(customerId);
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
}
