
/** 
  @author (Tarso Brietzke Iracet) 
 
 */
public class Cosmetico extends Loja{
    private double taxaComercializacao;     
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, double taxaComercializacao, int maxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja, maxProdutos);      
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // Getter
    public double getTaxaComercializacao(){
        return this.taxaComercializacao;
    }
    
    //Setter 
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    //ToString
    @Override
    public String toString() {
        return ("A loja " + super.getNome() + "de cosméticos, possuí " + super.getQuantidadeFuncionarios() + " funcionários com a base salárial de " + super.getSalarioBaseFuncionario() + "R$ por funcionário. A loja foi fundada em " + super.getDataFundacao() + ", está é sua localidade: " + super.getEndereco() + " e sua taxa de comercialização é: " + taxaComercializacao + ".");
    }
    
    
}
