/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendalista;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author guilherme.mariano
 */
public class ListaAgenda {
    int qtdElementos;
    Agenda primeiro, ultimo;
    public ListaAgenda(){
        this.qtdElementos = 0;
        this.primeiro = null;
        this.ultimo = null;
    }
    /*public ListaAgenda(String nome, int idade, char sexo){
        this.qtdElementos = 0;
        this.primeiro = null;
        this.ultimo = null;
    }
    */
    public void inserirNoComeco(String nome, int idade, char sexo){
        if(this.qtdElementos == 0){
            Agenda nova = new Agenda();
            nova.setNome(nome);
            nova.setIdade(idade);
            nova.setSexo(sexo);
            nova.setProximo(primeiro);
            this.primeiro = nova;
        }else{
            Agenda nova2 = new Agenda();
            nova2.setNome(nome);
            nova2.setIdade(idade);
            nova2.setSexo(sexo);
            nova2.setProximo(primeiro);
            primeiro = nova2;
        }
        this.qtdElementos++;
    }
    
    public void inserirNoFinal(String nome, int idade, char sexo){
        
        if(this.qtdElementos == 0){
            Agenda nova = new Agenda();
            nova.setNome(nome);
            nova.setIdade(idade);
            nova.setSexo(sexo);
            nova.setProximo(ultimo);
            this.primeiro = nova;
            this.ultimo = nova;
        }else{
            Agenda nova2 = new Agenda();
            nova2.setNome(nome);
            nova2.setIdade(idade);
            nova2.setSexo(sexo);
            nova2.setProximo(ultimo);
            ultimo = nova2;
        }
        this.qtdElementos++;
    }
    
    public void removerNoInicio(){
        if(this.qtdElementos == 0){
            System.out.println("Agenda vazia!");
        }else{
            Agenda aux = primeiro;
            primeiro = primeiro.getProximo();
            aux.setProximo(null);
            this.qtdElementos--;
        }
    }
    
    public void removerNoFim(){
        if(this.qtdElementos == 0){
            System.out.println("Agenda vazia!");
        }else{
            Agenda aux = ultimo;
            ultimo = ultimo.getProximo();
            aux.setProximo(null);
            this.qtdElementos--;
        }
    }
    
    public void escritor() throws FileNotFoundException, IOException {
        try (PrintWriter buffRead = new PrintWriter("AgendaLista.txt", "UTF-8")) {
            Agenda aux = this.primeiro;
            for ( int i = -1; i < this.qtdElementos-1; i++){
                System.out.printf("|Nome: %s | Idade: %d | Sexo: %c|\n", aux.getNome(), aux.getIdade(), aux.getSexo());
                        aux = aux.getProximo();
                buffRead.println("");
            }

        }
    }
 
    public void leitor() throws FileNotFoundException, IOException {
        BufferedReader buffWrite = new BufferedReader(new FileReader("AgendaLista.txt"));
        String line;
            while((line = buffWrite.readLine()) != null)
            {
                        System.out.println(line);
            }
                        buffWrite.close();
      
    }
    
    public void imprimir(){
        if(this.qtdElementos == 0){
            System.out.println("Agenda vazia!");
        }else{
            Agenda aux = this.primeiro;
            for(int i = 0; i < this.qtdElementos-1; i++){
                System.out.printf("|Nome: %s | Idade: %d | Sexo: %c|\n", aux.getNome(), aux.getIdade(), aux.getSexo());
                aux = aux.getProximo();
            }
            System.out.printf("|Nome: %s | Idade: %d | Sexo: %c|\n", aux.getNome(), aux.getIdade(), aux.getSexo());
        }
    }
}
