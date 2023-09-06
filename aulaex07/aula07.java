/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex07;

import java.util.Scanner;

/**Exercício 7
 *Disciplina:Linguagem de Programação
 * Data:15/08/23
 * @author geovana
 */
public class aula07 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); 
    System.out.println("Qual é o nome do aluno?");
    String nome = ler.next();
    
    System.out.println("Qual  é a primeira nota?");
    float nota1 = ler.nextFloat();
    System.out.println("Qual é a segunda nota?");
    float nota2 = ler.nextFloat();
    System.out.println("Qual é  a terceira nota? ");
    float nota3 = ler.nextFloat();
    System.out.println("Qual é a quarta nota?");
    float nota4 = ler.nextFloat();
     float soma = nota1 + nota2 + nota3 + nota4;
     float media = soma / 4;
     System.out.println("A media é:" + media);
    
    }
   
}
