package br.com.distribuidas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CONTATO")
public class Contato {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@NotEmpty
	@Column(name="NOME", nullable=false)
	private String nome;

	@NotEmpty
	@Column(name="SOBRENOME", nullable=false)
	private String sobreNome;

	@NotEmpty
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@NotEmpty
	@Column(name="TELEFONE", nullable=false)
	private int telefone;
	
	@Column(name="FAVORITO", nullable=true, columnDefinition = "TINYINT(1)")
	private boolean favorito;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="USER_ID",referencedColumnName="id")  
    private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", email=" + email + ", telefone="
				+ telefone + ", favorito=" + favorito + ", user=" + user + "]";
	}


}
