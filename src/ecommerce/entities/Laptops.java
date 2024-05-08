package ecommerce.entities;

public class Laptops extends Produto {
    private String categoria;

    public Laptops(int id, String nome, double preco, int quantidade) {
        super(id, nome, preco, quantidade);
       
    }  
}