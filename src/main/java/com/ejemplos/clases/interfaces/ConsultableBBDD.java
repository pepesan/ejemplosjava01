package com.ejemplos.clases.interfaces;

public class ConsultableBBDD implements Consultable{
    @Override
    public Usuario[] findAll() {
        return new Usuario[0];
    }

    @Override
    public Usuario findByID(Integer id) {
        return new Usuario();
    }

    @Override
    public Integer save(Usuario usuario) {
        return null;
    }

    @Override
    public Boolean update(Integer id, Usuario usuario) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }
}
