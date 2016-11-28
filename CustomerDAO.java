package com.howtodoinjava.dao;

import java.util.List;
import com.howtodoinjava.entity.CustomerEntity;

public interface CustomerDAO 
{
    public void addCustomer(CustomerEntity customer);
    public List<CustomerEntity> getAllCustomers();
    public void deleteCustomer(Integer customerId);
}