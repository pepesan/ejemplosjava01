package com.ejemplos.clases.interfaces;

public class ConsultableMemory implements Consultable{

    private Usuario[] usuarios;
    private Integer numUsuarios;

    ConsultableMemory(){
        usuarios = new Usuario[10];
        numUsuarios = 0;
    }
    @Override
    public Usuario[] findAll() {
        return usuarios;
    }

    @Override
    public Usuario findByID(Integer id) {
        return usuarios[id];
    }

    @Override
    public Integer save(Usuario usuario) {
        usuarios[numUsuarios] = usuario;
        return 0;
    }

    @Override
    public Boolean update(Integer id, Usuario usuario) {
        usuarios[id] = usuario;
        return true;
    }

    @Override
    public Boolean delete(Integer id) {
        return true;
    }
}
