package com.treinamento.service.business.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.treinamento.jpa.entity.Api;
import com.treinamento.service.business.IApiBusiness;
import com.treinamento.service.business.dao.ApiDao;

@Named
public class ApiBusiness implements IApiBusiness {

	@Inject
	private ApiDao apiDao;

	@Override
	public Api getApi() {
		return apiDao.getApi();
	}

}
