package com.treinamento.rest.type.converter;

import java.util.ArrayList;
import java.util.List;

import com.treinamento.jpa.entity.Pessoa;
import com.treinamento.rest.type.PessoaType;

public class PessoaTypeConverter implements ITypeConverter<PessoaType, Pessoa> {

	@Override
	public PessoaType convertToType(Pessoa entityClass) {
		PessoaType pessoaType = new PessoaType();
		if (entityClass != null) {			
			pessoaType.setAltura(entityClass.getAltura());
			pessoaType.setCarro(entityClass.getCarros());
			pessoaType.setEndereco(entityClass.getEndereco());
			pessoaType.setCpf(entityClass.getCpf());
			pessoaType.setDataNascimento(entityClass.getDataNascimento());
			pessoaType.setId(entityClass.getId());
			pessoaType.setNome(entityClass.getNome());
			pessoaType.setPeso(entityClass.getPeso());
			pessoaType.setProfissao(entityClass.getProfissao());
			pessoaType.setSexo(entityClass.getSexo());
		}
		return pessoaType;
	}

	@Override
	public Pessoa convertToEntity(PessoaType typeClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PessoaType> convertToType(List<Pessoa> entityClasses) {
		List<PessoaType> pessoaTypeList = new ArrayList<>();
		
		for(Pessoa pessoaEntity:entityClasses) {
			pessoaTypeList.add(convertToType(pessoaEntity));
		}
		return pessoaTypeList;
	}

	@Override
	public List<Pessoa> convertToEntity(List<PessoaType> typeClasses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PessoaType convertToType(Pessoa entityClass, String[] campos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PessoaType> convertToType(List<Pessoa> entityClasses, String[] campos) {
		// TODO Auto-generated method stub
		return null;
	}

}
