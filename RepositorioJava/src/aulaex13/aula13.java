/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex13;

import java.util.Scanner;

/**Exercício
 *Disciplina:Linguagem de Programação.
 * Data:22/08/23
 * @author 15671393612
 */
public class aula13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       int numero;
        
        System.out.println("Digite um numero inteiro:");
        numero = ler.nextInt();
               
        numero = numero % 2;
        
        if (numero != 0){
            System.out.println("O numero é impar.");
        }else{
            System.out.println("O numero é par.");
        }
    }
  
}
