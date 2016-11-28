package com.howtodoinjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.entity.CustomerEntity;

@Repository
public class CustomerDaoImpl implements CustomerDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(CustomerEntity customer) {
		this.sessionFactory.getCurrentSession().save(customer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomers() {
		return this.sessionFactory.getCurrentSession().createQuery("from CustomerEntity").list();
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		CustomerEntity customer = (CustomerEntity) sessionFactory.getCurrentSession().load(
				CustomerEntity.class, customerId);
        if (null != customer) {
        	this.sessionFactory.getCurrentSession().delete(customer);
        }
	}
	
	

}
