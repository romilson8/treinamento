package com.treinamento.rest.type.converter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.treinamento.jpa.entity.Api;
import com.treinamento.rest.type.ApiType;

@Named
public class ApiTypeConverter implements ITypeConverter<ApiType, Api> {

	@Override
	public ApiType convertToType(Api entityClass) {
		ApiType apiType = new ApiType();
		apiType.setId(entityClass.getId());
		apiType.setName(entityClass.getName());
		apiType.setVersion(entityClass.getVersion());
		return apiType;
	}

	@Override
	public Api convertToEntity(ApiType typeClass) {
		Api api = new Api();
		api.setId(typeClass.getId());
		api.setName(typeClass.getName());
		api.setVersion(typeClass.getVersion());
		return api;
	}

	@Override
	public List<ApiType> convertToType(List<Api> entityClasses) {
		List<ApiType> list = new ArrayList<>();

		for (Api entity : entityClasses)
			list.add(convertToType(entity));

		return list;
	}

	@Override
	public List<Api> convertToEntity(List<ApiType> typeClasses) {
		List<Api> list = new ArrayList<>();

		for (ApiType type : typeClasses)
			list.add(convertToEntity(type));

		return list;
	}

	@Override
	public ApiType convertToType(Api entityClass, String[] campos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApiType> convertToType(List<Api> entityClasses, String[] campos) {
		// TODO Auto-generated method stub
		return null;
	}

}
