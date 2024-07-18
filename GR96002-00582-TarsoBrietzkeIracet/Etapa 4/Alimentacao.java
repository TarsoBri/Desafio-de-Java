
/** 
  @author (Tarso Brietzke Iracet) 
 
 */
public class Alimentacao extends Loja{
    private Data dataAlvara;     
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, Data dataAlvara, int maxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja, maxProdutos);      
        this.dataAlvara = dataAlvara;
    }
    
    // Getter
    public Data getDataAlvara(){
        return this.dataAlvara;
    }
    
    //Setter 
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    //ToString
    @Override
    public String toString() {
        return ("A loja " + super.getNome() + "de alimentação, possuí " + super.getQuantidadeFuncionarios() + " funcionários com a base salárial de " + super.getSalarioBaseFuncionario() + "R$ por funcionário. A loja foi fundada em " + super.getDataFundacao() + ", est� � sua localidade: " + super.getEndereco() + " e recebeu seu alvará de funcionamento na data de: " + dataAlvara + ".");
    }
    
    
}
