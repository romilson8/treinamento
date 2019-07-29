package com.treinamento.rest.type;

import java.io.Serializable;
import java.util.List;

import com.treinamento.jpa.entity.Carro;
import com.treinamento.jpa.entity.Endereco;

public class PessoaType  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Endereco endereco;

	private List<Carro> carro;

	private Integer id;
	
	private String nome;

	private Double peso;

	private Double altura;

	private String profissao;

	private char sexo;
	
	private String dataNascimento;

	private String cpf;

	public PessoaType() {
		super();
	}

	public PessoaType(Endereco endereco, List<Carro> carro, Integer id, String nome, Double peso, Double altura,
			String profissao, char sexo, String dataNascimento, String cpf) {
		super();
		this.endereco = endereco;
		this.carro = carro;
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.profissao = profissao;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}



	public List<Carro> getCarro() {
		return carro;
	}



	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}



	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
