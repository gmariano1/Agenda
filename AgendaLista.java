/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendalista;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author guilherme.mariano
 */
public class AgendaLista {

    /**
     * @param args the command line arguments
     */
    public static void escolhas() {
        System.out.print("Escolha a Opcao:");
        System.out.print("\n1. Inserir no inicio");
        System.out.print(" \n2. Inserir no fim");
        System.out.print(" \n3. Excluir no inicio");
        System.out.print(" \n3. Excluir no fim");
        System.out.print(" \n5. Imprimir");
        System.out.print(" \n6. Gravar na memória");
        System.out.print(" \n7. Ler na Memória");
        System.out.print(" \n0. Sair");
        System.out.print("\n. Opcao :\t ");
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ListaAgenda a = new ListaAgenda();
        Scanner leia = new Scanner(System.in);
        escolhas();
        char opcao = leia.next().charAt(0);
        while (opcao != '0') {
            switch (opcao) {
                case '1':
                    System.out.println("Digite nome: ");
                    String nome = leia.nextLine();
                    System.out.println("Digite idade: ");
                    int idade = leia.nextInt();
                    System.out.println("Digite sexo: ");
                    char sexo = leia.nextLine().charAt(0);
                    a.inserirNoComeco(nome, idade, sexo);
                    break;
                case '2':
                    System.out.println("Digite nome: ");
                    String nome2 = leia.nextLine();
                    System.out.println("Digite idade: ");
                    int idade2 = leia.nextInt();
                    System.out.println("Digite sexo: ");
                    char sexo2 = leia.nextLine().charAt(0);
                    a.inserirNoFinal(nome2, idade2, sexo2);
                    break;
                case '3':
                    a.removerNoInicio();
                    break;

                case '4':
                    a.removerNoFim();
                    break;
                case '5':
                    a.imprimir();
                    break;
                case '6':
                    a.escritor();
                    break;
                case '7':
                    a.leitor();
                    break;
                
                default:
                    System.out.println("Opcao Invalida !");
            }
            escolhas();
            opcao = leia.next().charAt(0);
        }
        
    }
    
}
