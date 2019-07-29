package com.treinamento.rest.type.converter;

import java.util.ArrayList;
import java.util.List;

import com.treinamento.jpa.entity.Carro;
import com.treinamento.jpa.entity.Pessoa;
import com.treinamento.rest.type.CarroType;
import com.treinamento.rest.type.PessoaType;

public class CarroTypeConverter implements ITypeConverter<CarroType, Carro> {

	@Override
	public CarroType convertToType(Carro entityClass) {
		CarroType carroType = new CarroType();
		carroType.setAno(entityClass.getAno());
		carroType.setId(entityClass.getId());
		carroType.setMarca(entityClass.getMarca());
		carroType.setModelo(entityClass.getModelo());
//		carroType.setPessoa(entityClass.getPessoa());
		return null;
	}

	@Override
	public Carro convertToEntity(CarroType typeClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CarroType> convertToType(List<Carro> entityClasses) {
		List<CarroType> carroType = new ArrayList<CarroType>();
		for(Carro obj:entityClasses) {
			carroType.add(convertToType(obj));
		}
		return carroType;
	}

	@Override
	public List<Carro> convertToEntity(List<CarroType> typeClasses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarroType convertToType(Carro entityClass, String[] campos) {
		
		return null;
	}

	@Override
	public List<CarroType> convertToType(List<Carro> entityClasses, String[] campos) {
		// TODO Auto-generated method stub
		return null;
	}

}
