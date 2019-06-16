package com.treinamento.rest.type.converter;

import java.util.List;

/**
 * Interface de conversao.
 * 
 * @author alessandro.g.romero
 * 
 * @param <TypeClass> tipo a ser convertido
 * @param <EntityClass> entidade a ser convertida
 */
public interface ITypeConverter<TypeClass, EntityClass> {

    /**
     * Converte a partir da entidade.
     * 
     * @param entityClass classe da entidade
     * @return tipo
     */
    TypeClass convertToType(EntityClass entityClass);

    /**
     * Converte para entidade.
     * 
     * @param typeClass tipo da entidade
     * @return entidade
     */
    EntityClass convertToEntity(TypeClass typeClass);

    /**
     * Conversao de listas.
     * 
     * @param entityClasses entidade
     * @return tipo
     */
    List<TypeClass> convertToType(List<EntityClass> entityClasses);

    /**
     * Conversao de listas.
     * 
     * @param typeClasses tipo
     * @return entidade
     */
    List<EntityClass> convertToEntity(List<TypeClass> typeClasses);

    /**
     * Entidade para lista de tipos.
     * 
     * @param entityClass entidade
     * @param campos lista
     * @return tipo
     */
    TypeClass convertToType(EntityClass entityClass, String[] campos);

    /**
     * Entidade para lista de tipos.
     * 
     * @param entityClasses entidade
     * @param campos campos
     * @return tipo
     */
    List<TypeClass> convertToType(List<EntityClass> entityClasses, String[] campos);
}