/*
    Author: Tarso Brietzke Ircet

    Produto
 */

public class Produto{
    private String nome;
    private double preco;

    // Construtor 
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        
    }

    // Getters 
    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }
    
    // Setters
    public void setNome(String nome) {
     this.nome = nome;
    }
    public void setPreco(double preco) {
     this.preco = preco;
    }
    
    // ToString
    public String toString() {
        String precoFormatado;
    
        if (preco < 10) {
            precoFormatado = String.format("%.2f", preco);
        } else {
            precoFormatado = String.format("%.1f", preco);
        }
    
        return ("O produto " + nome + " vale " + precoFormatado + "R$.");
    }
    
}
