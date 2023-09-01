/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex08;

/**Exercício 08
 * Linguagem de Programação
 *Materia: Operadores Lógicos e Estruturas Condicionais
 * @author Geovana
 */
public class aula8 {
    public static void main(String[] args) {
     int a = 10;
     int b = 10;
     
     System.out.println(a > b && a < b);
     if(a > b){
         System.out.println("Maior");
     }else if(a < b){
         System.out.println("Menor");
     }else{
         System.out.println("Igual");
         
     }
    }
 
}
