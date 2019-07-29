package com.treinamento.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARRO")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "MODELO")
	private String modelo;
	@Column(name = "ANO")
	private Integer ano;
	@Column(name = "Marca")
	private String marca;
//	@ManyToOne
//	private Pessoa pessoa;	
	
	
	public Carro(Integer id, String modelo, Integer ano, String marca) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
//		this.pessoa = pessoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

//	public Pessoa getPessoa() {
//		return pessoa;
//	}
//
//	public void setPessoa(Pessoa pessoa) {
//		this.pessoa = pessoa;
//	}

}
