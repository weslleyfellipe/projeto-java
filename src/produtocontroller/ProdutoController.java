package produtocontroller;

import java.util.ArrayList;
import ecommerce.entities.Produto;
import produtorepository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	   public ArrayList <Produto> produtos = new ArrayList<>();
	   public ArrayList <Produto> carrinho = new ArrayList<>();	   
	   

	   public void adicionarCarrinho(int id ) {
		   
		   for (Produto item : produtos ) {
	        if (item.getId() ==id )  {
	         carrinho.add(item);    
	         item.setQuantidade(item.getQuantidade()-1);
	        	
	        }
		   
		   }
		   System.out.println("Produto Adicionado com Sucesso ! ");
		   for ( Produto item : carrinho ) {
			   System.out.println(item);
			  
		   }
		   
	    }

	   public void finalizarCompra() {
		   carrinho.removeAll(carrinho);
		   System.out.println("Obrigado pela Compra volte Sempre ! ");
	       
			
	    }
	@Override
	public void listarProdutos() {
		
        
        System.out.println("Essa é a Lista de Produtos : \n");
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
