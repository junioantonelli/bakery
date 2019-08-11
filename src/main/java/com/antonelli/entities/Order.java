package com.antonelli.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Order {

	enum State {
		NEW, CONFIRMED, READY, DELIVERED, PROBLEM, CANCELLED;
	}

	int number;

	State state;

	LocalDateTime dueTimeDate;

	Customer customer;

	String details;

	Map<Product, Integer> products;
	
	List<History> history;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
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
