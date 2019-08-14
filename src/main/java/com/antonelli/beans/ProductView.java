package com.antonelli.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;

import com.antonelli.entities.Product;
import com.antonelli.service.RegistrationService;

@Named
@RequestScope
public class ProductView implements Serializable{
	
	private static final long serialVersionUID = 1185935966458163809L;
	
	List<Product> list;
	private Product selectedProduct;

	@Autowired
	private RegistrationService service;

	@PostConstruct
	public void init() {
		this.updateProducts();
	}

	public void updateProducts() {
		this.list = service.getProductRepository().findAll();
	}

	public void deleteProduct() {
		service.getProductRepository().delete(selectedProduct);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Removed"));
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/bakery/main.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	public Product getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
}
