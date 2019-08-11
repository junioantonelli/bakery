package com.antonelli.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.antonelli.entities.Order;
import com.antonelli.service.RegistrationService;

@Named
@RequestScoped
public class OrderView implements Serializable {

	private static final long serialVersionUID = 1L;
	List<Order> list;
	private Order selectedOrder;

	@Autowired
	private RegistrationService service;

	@PostConstruct
	public void init() {
		this.updateOrders();
	}

	public void updateOrders() {
		this.list = service.getOrderRepository().findAll();
	}

	public void deleteOrder() {
		service.getOrderRepository().delete(selectedOrder);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Removed"));
	}

	public List<Order> getLista() {
		return list;
	}

	public void setLista(List<Order> list) {
		this.list = list;
	}

	public Order getSelectedOrder() {
		return selectedOrder;
	}

	public void setSelectedOrder(Order selectedOrder) {
		this.selectedOrder = selectedOrder;
	}
}