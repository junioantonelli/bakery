package com.antonelli;

import java.util.Hashtable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class Login implements Serializable {

	private UIComponent component;

	private String usuario;

	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static void main(String[] args) {
		Login login = new Login();

		login.validateLogin();
	}

	public void validateLogin() {

//		if(!this.usuario.equals("admin") || !this.senha.equals("admin")) {
//			return "index";
//		}
		///////////////////////////////////////////////////////////////////
//		String url = "ldap://ad-tri:389";
//		Hashtable<String, String> env = new Hashtable<String, String>();
//		String principalName = this.usuario + "@" + "ifgoiano.local";
//		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//		env.put(Context.PROVIDER_URL, url);
//		env.put(Context.SECURITY_AUTHENTICATION, "simple");
//		env.put(Context.SECURITY_PRINCIPAL, principalName);
//		env.put(Context.SECURITY_CREDENTIALS, this.senha);
//
//		try {
//			DirContext ctx = new InitialDirContext(env);
//			System.out.println("connected");
//			System.out.println(ctx.getEnvironment());
//			ctx.close();
//
//		} catch (AuthenticationNotSupportedException ex) {
//			System.out.println("A autenticação não pôde ser verificada pelo servidor");
//		} catch (AuthenticationException ex) {
//			System.out.println("usuário ou senha incorretos");
//		} catch (NamingException ex) {
//			System.out.println("Erro ao tentar criar o contexto LDAP");
//		}
		/////////////////////////////////////////////////////

//		Hashtable<String, String> props = new Hashtable<String, String>();
//		String principalName = this.usuario + "@" + "ifgoiano.local";
//		props.put(Context.SECURITY_PRINCIPAL, principalName);
//		props.put(Context.SECURITY_CREDENTIALS, this.senha);
//		try {
//			LdapCtxFactory.getLdapCtxInstance("ldap://ad-tri:389", props);
//		} catch (AuthenticationException e) {
//			return null;
//		} catch (NamingException e) {
//			return null;
//		}

//		HttpSession session = SessionUtils.getSession();
//		session.setAttribute("username", this.usuario);
//		session.setAttribute("fullname", this.usuario);
//		return "bakery/main";

		FacesContext context = FacesContext.getCurrentInstance();

		if (this.usuario.equals("admin") && this.senha.equals("admin")) {
			context.getExternalContext().getSessionMap().put("user", usuario);
			try {
				context.getExternalContext().redirect("bakery/main.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			// Send an error message on Login Failure
			FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Authentication Failed", "Details"));
		}
	}

	public UIComponent getComponent() {
		return component;
	}

	public void setComponent(UIComponent component) {
		this.component = component;
	}

	public void logout() {
//		HttpSession session = SessionUtils.getSession();
//		session.invalidate();
//		return "index";
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().invalidateSession();
		try {
			context.getExternalContext().redirect("/index.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}