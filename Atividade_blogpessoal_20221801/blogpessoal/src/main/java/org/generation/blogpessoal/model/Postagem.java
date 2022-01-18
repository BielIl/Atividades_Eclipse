package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_postagem;
	
	@NotNull
	@Size(min = 8, max = 128)
	private String titulo_postagem;
	
	@NotNull
	@Size(min = 32, max = 512)
	private String texto_postagem;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_postagem = new java.sql.Date(System.currentTimeMillis());
	
	public long getId_postagem() {
		return id_postagem;
	}
	public void setId_postagem(long id_postagem) {
		this.id_postagem = id_postagem;
	}
	public String getTitulo_postagem() {
		return titulo_postagem;
	}
	public void setTitulo_postagem(String titulo_postagem) {
		this.titulo_postagem = titulo_postagem;
	}
	public String getTexto_postagem() {
		return texto_postagem;
	}
	public void setTexto_postagem(String texto_postagem) {
		this.texto_postagem = texto_postagem;
	}
	public Date getDate_postagem() {
		return date_postagem;
	}
	public void setDate_postagem(Date date_postagem) {
		this.date_postagem = date_postagem;
	}
	
	
}
