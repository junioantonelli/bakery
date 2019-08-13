package com.antonelli.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.antonelli.types.State;

@Entity
@Table(name="order_products")
public class Order implements Serializable{

	private static final long serialVersionUID = 6536396416248742913L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;

	@Enumerated(EnumType.STRING)
	State state;

	@Column
	LocalDateTime dueTimeDate;

	@Column
	String customerName;
	
	@Column
	String customerAddress;

	@Column
	String details;

//	List<Product> products;
	
//	List<MessageHistory> history;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public LocalDateTime getDueTimeDate() {
		return dueTimeDate;
	}

	public void setDueTimeDate(LocalDateTime dueTimeDate) {
		this.dueTimeDate = dueTimeDate;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

//	public List<MessageHistory> getHistory() {
//		return history;
//	}
//
//	public void setHistory(List<MessageHistory> history) {
//		this.history = history;
//	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
	
}
