package ecommerce.entities;



public abstract class Produto {

	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(int id, String nome, double preco, int quantidade) {
		super();
		this.id = id;
		this.nome = nome;
	    this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return   "\n" + id + " - " + nome + "  R$ : " + preco + " \n Quantidade em Estoque : " + quantidade ;
		
	}
	
	
}
