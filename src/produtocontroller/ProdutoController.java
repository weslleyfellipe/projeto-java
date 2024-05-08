package produtocontroller;

import java.util.ArrayList;
import java.util.Scanner;

import ecommerce.entities.Produto;
import produtorepository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	   public ArrayList <Produto> produtos = new ArrayList<>();
	   public ArrayList <Produto> carrinho = new ArrayList<>();	   
	   

	   public void adicionarCarrinho(int id ) {
		   
		   for (Produto item : produtos ) {
	        if (item.getId() ==id )  {
	         carrinho.add(item);    
	        	
	        }
		   
		   }
		   System.out.println("Produto Adicionado com Sucesso ! ");
		   for ( Produto item : carrinho ) {
			   System.out.println(item);
		   }
	    }

	   public void finalizarCompra() {
	       
			
	    }
	@Override
	public void listarProdutos() {
		
        
        System.out.println("Produtos da Loja");
        for (Produto item : produtos ) {
        	System.out.println( item);
        }
        // Lista do catalogos
		
	}
	@Override
	public void adicionarItem(Produto produto) {
		   produtos.add(produto);
	}
	@Override
	public void verCarrinho() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void comprar() {
		// TODO Auto-generated method stub
		
	}

}
