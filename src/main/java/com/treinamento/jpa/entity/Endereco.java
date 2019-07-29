package com.treinamento.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "RUA")
	private String rua;
	@Column(name = "CEP")
	private Double cep;
	@Column(name = "BAIRRO")
	private Double bairro;
	@Column(name = "CIDADE")
	private String cidade;	

	public Endereco() {
		super();
	}

	public Endereco(Integer id, String rua, Double cep, Double bairro, String cidade) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Double getCep() {
		return cep;
	}

	public void setCep(Double cep) {
		this.cep = cep;
	}

	public Double getBairro() {
		return bairro;
	}

	public void setBairro(Double bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	

}
