package com.treinamento.service.business.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.treinamento.jpa.entity.Pessoa;

@Named
public class PessoaDAO {

	@Inject
	private EntityManager entityManager;

	public Pessoa createPessoa(Pessoa pessoa) {
		try {
			entityManager.persist(pessoa);
			return pessoa;
		} catch (Exception e) {
			throw e;
		}
	}

	public Pessoa deletePessoa(Pessoa pessoa) {
		try {
			entityManager.remove(pessoa);
			return pessoa;
		} catch (Exception e) {
			throw e;
		}

	}

	public Pessoa buscarPessoa(Pessoa pessoa) {
		try {
			return entityManager.find(Pessoa.class, pessoa.getId());

		} catch (Exception e) {
			throw e;
		}
	}
	
	public Pessoa updatePessoa(Pessoa pessoa) {
		try {
			return entityManager.merge(pessoa);
		} catch (Exception e) {
			throw e;
		}
	}
}
