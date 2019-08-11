package com.antonelli.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.antonelli.entities.Customer;
import com.antonelli.service.RegistrationService;

@Named
@RequestScoped
public class CustomerView implements Serializable {

	private static final long serialVersionUID = -6554468955779303319L;

	List<Customer> list;
	private Customer selectedCustomer;

	@Autowired
	private RegistrationService service;

	@PostConstruct
	public void init() {
		this.updateCustomers();
	}

	public void updateCustomers() {
		this.list = service.getCustomerRepository().findAll();
	}

	public void deleteCustomer() {
		service.getCustomerRepository().delete(selectedCustomer);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Removed"));
	}

	public List<Customer> getLista() {
		return list;
	}

	public void setLista(List<Customer> list) {
		this.list = list;
	}

	public Customer getSelectedCustomer() {
		return selectedCustomer;
	}

	public void setSelectedCustomer(Customer selectedCustomer) {
		this.selectedCustomer = selectedCustomer;
	}
}