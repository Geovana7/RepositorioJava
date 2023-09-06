/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex12;

import java.util.Scanner;

/**Exercício
 * Diosciplina:Linguagem de Programação
 *Data:22/08/23
 * @author Geovana
 */
public class aula12 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int idade;
     
     System.out.println("Digite a sua idade: ");
     idade = ler.nextInt();
     
     if (idade >=18){
         System.out.println("Maior de idade. ");
     }else{
         System.out.println("Menor de idade.");
     }
    }
 
}
