/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUPSI-04
 */
public class SetorM {
    private int id;
    private String nome;
    private int ramal;

    public SetorM(int id, String nome, int ramal) {
        this.id = id;
        this.nome = nome;
        this.ramal = ramal;
    }

    public SetorM() {
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

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    
}
