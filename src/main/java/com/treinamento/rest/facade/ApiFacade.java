package com.treinamento.rest.facade;

import javax.inject.Inject;
import javax.inject.Named;

import com.treinamento.rest.type.ApiType;
import com.treinamento.rest.type.converter.ApiTypeConverter;
import com.treinamento.service.business.IApiBusiness;

@Named
public class ApiFacade {

	@Inject
	private IApiBusiness iApiBusiness;

	@Inject
	private ApiTypeConverter apiTypeConverter;

	public ApiType getApi() {

		return apiTypeConverter.convertToType(iApiBusiness.getApi());
	}
}
