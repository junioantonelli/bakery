package com.antonelli.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.antonelli.repositories.CustomerRepository;
import com.antonelli.repositories.HistoryRepository;
import com.antonelli.repositories.OrderRepository;
import com.antonelli.repositories.ProductRepository;
import com.antonelli.repositories.UserRepository;

/** 
 * Registration Service
 * This class is just to avoid the presentation layer talks directly
 * with the repository.
 * 
 * @author antonelli
 *
 */
public class RegistrationService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private HistoryRepository historyRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public HistoryRepository getHistoryRepository() {
		return historyRepository;
	}

	public void setHistoryRepository(HistoryRepository historyRepository) {
		this.historyRepository = historyRepository;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
