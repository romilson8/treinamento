package com.treinamento.rest.type;

import java.io.Serializable;

public class ApiType implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer version;

	public ApiType() {

	}

	public ApiType(Integer id, String name, Integer version) {
		this.id = id;
		this.name = name;
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
