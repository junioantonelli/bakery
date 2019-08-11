package com.antonelli;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

import org.springframework.stereotype.Component;
import java.io.Serializable;

@ManagedBean
@SessionScoped
@Component
public class LayoutUI implements Serializable {

	private String view;
	
	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
	
	public void configureView(String path) {
		this.view = path;
	}
	
}