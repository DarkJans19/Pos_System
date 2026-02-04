package com.ejemplo.repositorios;

import java.util.Optional;

import javax.persistence.EntityManager;

public class RepositorioGenerico <T>{
    private final Class<T> tipoEntidad;
    private final EntityManager entityManager;

    public RepositorioGenerico(EntityManager entityManager, Class <T> tipoEntidad){
        this.tipoEntidad = tipoEntidad;
        this.entityManager = entityManager;
    }

    public T crear(T entidad){
        entityManager.persist(entidad);
        entityManager.flush();
        return entidad;
    }

    public Optional<T> buscarPorId(Integer id){
        return Optional.of(entityManager.find(tipoEntidad, id));
    }

    public void eliminar(T entidad){
        entityManager.remove(entidad);
    }

    public T actualizar(T entidad){
        entityManager.merge(entidad);
        return entidad;
    }
}
