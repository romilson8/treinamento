package com.treinamento.rest.type;

import java.io.Serializable;

import com.treinamento.jpa.entity.Pessoa;

public class CarroType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String modelo;
	private Integer ano;
	private String marca;

	public CarroType() {
		super();
	}

	public CarroType(Integer id, String modelo, Integer ano, String marca, Pessoa pessoa) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
		this.pessoa = pessoa;
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	private Pessoa pessoa;
}
