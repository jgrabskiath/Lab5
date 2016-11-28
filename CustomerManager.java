package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.entity.CustomerEntity;

public interface CustomerManager {
	public void addCustomer(CustomerEntity customer);
    public List<CustomerEntity> getAllCustomers();
    public void deleteCustomer(Integer customerId);
}
