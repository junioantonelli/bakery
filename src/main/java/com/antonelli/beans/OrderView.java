package com.antonelli.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.antonelli.entities.Order;

@Named
@RequestScoped
public class OrderView  implements Serializable{

	private static final long	serialVersionUID	= 1L;
	List<Order>								list;
	private Order							selectedOrder;


	@PostConstruct
	public void init() {
		this.updateOrders();
	}

	public void updateOrders() {
		
	}

	public void deleteCurso() {
	}

	public void showMessage() {
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