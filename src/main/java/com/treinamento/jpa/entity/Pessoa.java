package com.treinamento.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {

	@OneToOne
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;
	@OneToMany
	@JoinColumn(name = "carro_id")
	private List<Carro> carros;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "PESO")
	private Double peso;
	@Column(name = "ALTURA")
	private Double altura;
	@Column(name = "PROFISSAO")
	private String profissao;
	@Column(name = "SEXO")
	private char sexo;
	@Column(name = "DATNASC")
	private String dataNascimento;
	@Column(name = "CPF")
	private String cpf;

	public Pessoa() {
		super();
	}
	

	public Pessoa(Endereco endereco, List<Carro> carros, Integer id, String nome, Double peso, Double altura,
			String profissao, char sexo, String dataNascimento, String cpf) {
		super();
		this.endereco = endereco;
		this.carros = carros;
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.profissao = profissao;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
