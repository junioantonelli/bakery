package com.antonelli.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;

import com.antonelli.entities.Order;

@ManagedBean
@RequestScoped
public class OrderView  implements Serializable{

	private static final long	serialVersionUID	= 1L;
	List<Order>								lista;
	private Order							selectedCurso;

	@ManagedProperty(value = "#{databaseQueries}")
	private DatabaseQueries		queries;

	@PostConstruct
	public void init() {
		this.updateOrders();
	}

	public void updateOrders() {
		try {
			Order order = new Order();
			ResultSet resultCurso = queries.selectAll(new Curso());
			this.lista = new ArrayList<Curso>();

			// monta a lista de usuários para o formulario de pesquisa
			while (resultCurso.next()) {
				curso.setIdCurso(resultCurso.getInt("id_curso"));
				curso.setNome(resultCurso.getString("curso"));
				this.lista.add(curso);
				curso = new Curso();
			}
		} catch (SQLException e) {
			System.out.println("Erro no CursoView: " + e);
			e.printStackTrace();
		}
	}

	public void deleteCurso() {
		queries.remove(this.selectedCurso);
		this.lista.remove(this.selectedCurso);
		this.selectedCurso = null;
		this.showMessage();
	}

	public void showMessage() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Removido"));
	}

	public List<Curso> getLista() {
		return lista;
	}

	public void setLista(List<Curso> lista) {
		this.lista = lista;
	}

	public DatabaseQueries getQueries() {
		return queries;
	}

	public void setQueries(DatabaseQueries queries) {
		this.queries = queries;
	}

	public Curso getSelectedCurso() {
		return selectedCurso;
	}

	public void setSelectedCurso(Curso selectedCurso) {
		this.selectedCurso = selectedCurso;
	}
}