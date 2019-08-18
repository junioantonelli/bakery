package com.antonelli.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.antonelli.entities.User;
import com.antonelli.service.RegistrationService;

@Named
@RequestScoped
public class UserView implements Serializable {

	private static final long serialVersionUID = 2948626896569895981L;
	List<User> list;
	private User selectedUser;

	@Autowired
	private RegistrationService service;

	@PostConstruct
	public void init() {
		this.updateUsers();
	}

	public void updateUsers() {
		this.list = service.getUserRepository().findAll();
	}

	public void deleteUser() {
		service.getUserRepository().delete(this.selectedUser);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Removed"));
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/bakery/main.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}
}