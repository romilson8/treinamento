package com.treinamento.service.business.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.treinamento.jpa.entity.Api;

@Named
public class ApiDao {

	@Inject
	private EntityManager entityManager;
	
	public Api getApi() {
		
		return entityManager.find(Api.class, 1);
	}
}
