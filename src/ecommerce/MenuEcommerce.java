package ecommerce;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.util.Cores;
import ecommerce.entities.Laptops;
import ecommerce.entities.Produto;
import ecommerce.entities.Smartphones;
import produtocontroller.ProdutoController;
public class MenuEcommerce {

public static Scanner leia = new Scanner(System.in);
		





	public static void main(String[] args) {
		
       int opcao;
       ProdutoController produto = new ProdutoController();
       
       Produto p1 = new Laptops(1, "Notebook dell", 3500, 20);
       produto.adicionarItem(p1);
      
       Produto p2 = new Smartphones(2, "Iphone 15", 5500, 20);
       produto.adicionarItem(p2);
      
       Produto p3 = new Smartphones(3, "Galaxy S24", 5000, 15);
       produto.adicionarItem(p3);
       
       Produto p4 = new Laptops(4, "Nootbook Sansumg", 100.00, 15);
       produto.adicionarItem(p4);
      
       Produto p5 = new Laptops(5, "Macbook", 6400.00, 10);
       produto.adicionarItem(p5);
      
     
	 
       
     
       do {
           System.out.println(Cores. TEXT_BLACK_BOLD+ Cores.ANSI_WHITE_BACKGROUND + "Bem-vindo à Loja Eletrônica!             ");
           System.out.println("                                         ");
           System.out.println("           1- Ver catálogo               ");
           System.out.println("           2- Adicionar item ao carrinho ");
           System.out.println("           3- Finalizar compra           ");
           System.out.println("           4- Sair                       ");
           System.out.println("                                         ");
           System.out.println("             Escolha uma opção:          " + Cores.TEXT_RESET);
           
           opcao = leia.nextInt();
           
           
           switch (opcao) {
               case 1:
               produto.listarProdutos();
              
   				keypress();
                   break;
                  
                  
               case 2:
            	   System.out.println("Digite o Id do Produto : ");
            	   int idProduto =leia.nextInt();
            	   produto.adicionarCarrinho(idProduto);
                 
                   break;
               case 3:
            	 produto.finalizarCompra();
                   
                   break;
               case 4:
            	System.out.println("Obrigado por visitar a Loja Eletrônica! Volte sempre.");
                sobre();
                leia.close();
                System.exit(0);
                   break;
               default:
                   System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                   break;
                  
                   
           }
       } while (opcao != 5);
   }

   


	public static void sobre() {
		System.out.println(Cores. TEXT_BLACK_BOLD+ Cores.ANSI_WHITE_BACKGROUND + "\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Weslley Fellipe                ");
		System.out.println("Email :  Weslleyfellipe1@gmail.com                       ");
		System.out.println("https://github.com/weslleyfellipe                        ");
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