package com.antonelli.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.antonelli.types.State;

@Entity
@Table(name="order")
public class Order implements Serializable{

	private static final long serialVersionUID = 6536396416248742913L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long number;

	State state;

	LocalDateTime dueTimeDate;

	Customer customer;

	String details;

	Map<Product, Integer> products;
	
	List<History> history;

	public Order(State state, LocalDateTime dueTimeDate, Customer customer, String details,
			Map<Product, Integer> products) {
		super();
		this.state = state;
		this.dueTimeDate = dueTimeDate;
		this.customer = customer;
		this.details = details;
		this.products = products;
	}

	public Order() {}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}

	public List<History> getHistory() {
		return history;
	}

	public void setHistory(List<History> history) {
		this.history = history;
	}
	
}
