/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex14;

import java.util.Scanner;

/**Exercício
 *Disciplina:Linguagem de Programação.
 * Data:22/08/23
 * Prepare umprograma que o código correspondente
 * @author Geovana
 */
public class aula14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        
        do{
            System.out.println("Cardapio");
            System.out.println("1 - Hamburgue.");
            System.out.println("2 - Cheeseburgue");
            System.out.println("3 - Fritas");
            System.out.println("4 - Refrigerante."); 
            System.out.println("5 - Milkshake.");
            System.out.println("0.Sair");
            System.out.println("Escolha um lanche: ");
            escolha = ler.nextInt();
            
            switch (escolha){
            case 1:
            System.out.println("Você escolheu o hambúrguer no valor de R$30,00.");
            break;
            
            case 2:
               System.out.println("Você escolheu o cheeseburgue no valor de R$35,00.");
               break;
               
            case 3:
               System.out.println("Você escolheu o fritas no valor de R$20,50.");
               break;
               
             case 4:
               System.out.println("Você escolheu o refrigerante no valor de R$10,00.");
               break;
               
               case 5:
               System.out.println("Você escolheu o milkshake no valor de R$30,00.");
               break; 
               default:
                   System.out.println("Opção Invalida");
                   break;
        }
          System.out.println("----------------");
          //linha em branco para separar as iterações
        }while (escolha !=0);
    }    
}    
 

