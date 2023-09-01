/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex10;

import java.util.Scanner;

/**Excercício
 *Disciplna:Linguagem de Programação.
 * Data:21/08/23
 * @author Geovana
 */
public class aula10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int escolha;
        
        do{
            System.out.println("Menu");
            System.out.println("1.Opção 1");
            System.out.println("2.Opção 2");
            System.out.println("3.Opção 3");
            System.out.println("0.Opção Sair");
            System.out.println("Escolha uma opção:");
            escolha = ler.nextInt();
            
            switch (escolha){
                case 1:
                 System.out.println("Você escolheu a opção 1");
                 break;
                 
                case 2:
                 System.out.println("Você escolheu a opção 2");
                 break;
                 
                 case 3:
                 System.out.println("Você escolheu a opção 3");
                 break;
                 
                 case 0:
                 System.out.println("Saindo do programa.");
                 break;
                  
                 default:
                     System.out.print("Opção inválida.");
                     break;
            }         
                     System.out.println();
                     //Linha em branco para separar as interações
        }while(escolha !=0);
    }
        
}   
                     
            }
        }
    }
}
