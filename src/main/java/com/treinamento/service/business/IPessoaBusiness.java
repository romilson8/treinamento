package com.treinamento.service.business;

import com.treinamento.jpa.entity.Pessoa;

public interface IPessoaBusiness {
	public Pessoa createPessoa(Pessoa pessoa);
	public Pessoa atualizarPessoa(Pessoa pessoa);
	public Pessoa deletePessoa(Pessoa pessoa);
	public Pessoa listarPessoas(Pessoa pessoa);
}
