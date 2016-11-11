/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Leopo
 */
public class UsuarioM {
    int id;
    String nome;
    String contato;
    String usuario;
    String senha;
    boolean admin;

    public UsuarioM(int id, String nome, String contato, String usuario, String senha, boolean admin) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.usuario = usuario;
        this.senha = senha;
        this.admin = admin;
    }

    public UsuarioM(int id, String nome, String contato, String usuario) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.usuario = usuario;
    }

    public UsuarioM() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }




    
}
