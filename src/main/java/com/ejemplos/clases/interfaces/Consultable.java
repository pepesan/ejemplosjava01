package com.ejemplos.clases.interfaces;

public interface Consultable {
    public Usuario[] findAll();
    public Usuario findByID(Integer id);
    public Integer save(Usuario usuario);
    public Boolean update(Integer id, Usuario usuario);
    public Boolean delete (Integer id);
}
