package produtorepository;

import ecommerce.entities.Produto;

public interface ProdutoRepository {
	

	public void listarProdutos();
	public void adicionarItem(Produto produto);
	public void verCarrinho();
	public void comprar();
	
	
	 
	  
}
	


	
	
