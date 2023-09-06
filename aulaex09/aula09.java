/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex09;

import java.util.Scanner;

/**Exercício 09
 *Disciplina:Linguagem de Programação
 * Data:15/08/23
 * @author Geovana
 */
public class aula09 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Digfite um número:");
     float n = ler.nextInt();
     if(n > 0){
         System.out.println("Positivo");
     }else if (n<0){
         System.out.println("Negativo");
     }else{
         System.out.println("Igual");
     }
     
             
    }
  
}
