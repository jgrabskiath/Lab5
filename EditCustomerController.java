package com.howtodoinjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.howtodoinjava.entity.CustomerEntity;
import com.howtodoinjava.service.CustomerManager;

@Controller
public class EditCustomerController {
	
	@Autowired
	private CustomerManager customerManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listCustomers(ModelMap map) 
	{
		map.addAttribute("customer", new CustomerEntity());
		map.addAttribute("customerList", customerManager.getAllCustomers());
		
		return "editCustomersList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute(value="customer") CustomerEntity customer, BindingResult result) 
	{
		customerManager.addCustomer(customer);
		return "redirect:/";
	}

	@RequestMapping("/delete/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") Integer customerId)
	{
		customerManager.deleteCustomer(customerId);
		return "redirect:/";
	}

	public void setCustomerManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
	}
}
