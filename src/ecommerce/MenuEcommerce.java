package ecommerce;
import java.io.IOException;
import java.util.Scanner;

import conta.util.Cores;


public class MenuEcommerce {

public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
       int opcao;
       
       
       
     
       do {
           System.out.println(Cores.TEXT_GREEN+ Cores.ANSI_BLACK_BACKGROUND + "Bem-vindo à Loja Eletrônica!             ");
           System.out.println("                                         ");
           System.out.println("           1- Ver catálogo               ");
           System.out.println("           2- Adicionar item ao carrinho ");
           System.out.println("           3- Ver carrinho               ");
           System.out.println("           4- Finalizar compra           ");
           System.out.println("           5- Sair                       ");
           System.out.println("                                         ");
           System.out.print("             Escolha uma opção:          " + Cores.TEXT_RESET);
           
           opcao = leia.nextInt();

           switch (opcao) {
               case 1:
                  
                   break;
               case 2:
                  
                   break;
               case 3:
                   
                   break;
               case 4:
                   
                   break;
               case 5:
                   System.out.println("Obrigado por visitar a Loja Eletrônica! Volte sempre.");
                   break;
               default:
                   System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                   break;
           }
       } while (opcao != 5);
   }

   


	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Weslley Fellipe - Weslleyfellipe1@gmail.com");
		System.out.println("https://github.com/weslleyfellipe");
		System.out.println("*********************************************************");

	}
	
	   public static void keypress() {
	      try {
		   

				System.out.println("\n\nPressione Enter para Continuar...");
				System.in.read();
	      }catch(IOException e ) {	
	    	  System.out.println("Você Pressionou uma tecla diferente de Enter !!");

		   }
	   
	}
	
}