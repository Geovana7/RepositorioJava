/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex17;

import java.util.Scanner;

/**
 *Disciplina:Linguagem de Programação
 * Faça um programa que construa a uma sequência de dois em dois
 * Data:05/09/23
 * @author Geovana
 */
public class aula17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um valor inteiro:");
        n = ler.nextInt();
        
        for(int i = 2; i < n; i+=2){
        System.out.println(i);
    }
   
    }    
}
