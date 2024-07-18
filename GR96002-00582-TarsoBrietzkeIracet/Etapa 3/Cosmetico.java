
/** 
 * @author (Tarso Brietzke Iracet) 
 
 */
public class Cosmetico extends Loja{
    private double taxaComercializacao;     
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja);      
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
        return ("A loja " + super.getNome() + "de cosméticos, possuí " + super.getQuantidadeFuncionarios() + " funcion�rios com a base sal�rial de " + super.getSalarioBaseFuncionario() + "R$ por funcion�rio. A loja foi fundada em " + super.getDataFundacao() + ", est� � sua localidade: " + super.getEndereco() + " e sua taxa de comercializa��o �: " + taxaComercializacao + ".");
    }
    
    
}
