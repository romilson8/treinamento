package com.treinamento.rest.type;

import java.io.Serializable;

import com.treinamento.jpa.entity.Pessoa;

public class EnderecoType implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String rua;
	private Double cep;
	private Double bairro;
	private String cidade;
	private Pessoa pessoa;

	public EnderecoType() {
		super();
	}

	public EnderecoType(Integer id, String rua, Double cep, Double bairro, String cidade, Pessoa pessoa) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.pessoa = pessoa;
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
