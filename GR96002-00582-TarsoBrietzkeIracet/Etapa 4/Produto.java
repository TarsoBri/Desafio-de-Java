/**
      @author Tarso Brietzke Iracet
 */

public class Produto{
    private String nome;
    private double preco;
    private Data dataDeValidade;

    // Construtor 
    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    // Getters 
    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public Data getDataValidade() {
        return this.dataDeValidade;
    }

    // Setters
    public void setNome(String nome) {
     this.nome = nome;
    }
    public void setPreco(double preco) {
     this.preco = preco;
    }
    public void setDataValidade(Data validade) {
     this.dataDeValidade = validade;
    }
    
    // Revisar vencimento do produto
    public boolean estaVencido(Data dataAtual) {
         System.out.println(dataAtual.getAno() + " " + dataDeValidade.getAno());
        if (dataAtual.getAno() > dataDeValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() < dataDeValidade.getAno()) {
            return false;
        } else { // Se os anos forem iguais
            if (dataAtual.getMes() > dataDeValidade.getMes()) {
                    return true;
                } else if (dataAtual.getMes() < dataDeValidade.getMes()) {
                    return false;
            } else { // Se os meses forem iguais
                if (dataAtual.getDia() > dataDeValidade.getDia()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
    
    // ToString
    public String toString() {
        String precoFormatado;
    
        if (preco < 10) {
            precoFormatado = String.format("%.2f", preco);
        } else {
            precoFormatado = String.format("%.1f", preco);
        }
    
        return ("Produto: " + nome + ", valor: " + precoFormatado + "R$ e " + "Data de validade: "+ dataDeValidade);
    }
    
}
