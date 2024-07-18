
/** 
  @author (Tarso Brietzke Iracet) 
 
 */
public class Informatica extends Loja{
    private double seguroEletronicos;     
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, double seguroEletronicos, int maxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja, maxProdutos);      
        this.seguroEletronicos = seguroEletronicos;
    }
    
    // Getter
    public double getSeguroEletronicos(){
        return this.seguroEletronicos;
    }
    
    //Setter 
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
    //ToString
    @Override
    public String toString() {
        return ("A loja " + super.getNome() + "de informática, possuí " + super.getQuantidadeFuncionarios() + " funcionários com a base salárial de " + super.getSalarioBaseFuncionario() + "R$ por funcionário. A loja foi fundada em " + super.getDataFundacao() + ", está é sua localidade: " + super.getEndereco() + " e possuí um seguro que lojas que vendem aparelhos eletrônicos devem pagar mensalmente, com o valor de: " + seguroEletronicos + ".");
    }
    
    
}
