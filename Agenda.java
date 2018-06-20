/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendalista;

/**
 *
 * @author guilherme.mariano
 */
public class Agenda {
    private String nome;
    private int idade;
    private char sexo;
    private Agenda proximo;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setProximo(Agenda proximo){
        this.proximo = proximo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    public Agenda getProximo(){
        return this.proximo;
    }

}
