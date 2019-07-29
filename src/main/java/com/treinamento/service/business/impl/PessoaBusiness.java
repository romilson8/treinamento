package com.treinamento.service.business.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.treinamento.jpa.entity.Pessoa;
import com.treinamento.service.business.IPessoaBusiness;
import com.treinamento.service.business.dao.PessoaDAO;

@Named
public class PessoaBusiness implements IPessoaBusiness {
	@Inject
	private PessoaDAO pessoaDAO;

	@Override
	public Pessoa createPessoa(Pessoa pessoa) {
		return pessoaDAO.createPessoa(pessoa);
	}
	@Override
	public Pessoa deletePessoa(Pessoa pessoa) {
		return pessoaDAO.deletePessoa(pessoa);
	}
	@Override
	public Pessoa listarPessoas(Pessoa pessoa) {
		return pessoaDAO.buscarPessoa(pessoa);
	}
	@Override
	public Pessoa atualizarPessoa(Pessoa pessoa) {
		return pessoaDAO.updatePessoa(pessoa);
	}
}
