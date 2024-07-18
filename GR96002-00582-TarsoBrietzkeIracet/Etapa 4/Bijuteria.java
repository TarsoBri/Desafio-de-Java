
/** 
  @author (Tarso Brietzke Iracet) 
 
 */
public class Bijuteria extends Loja{
    private double metaVendas;     
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, double metaVendas, int maxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja, maxProdutos);      
        this.metaVendas = metaVendas;
    }
    
    // Getter
    public double getMetaVendas(){
        return this.metaVendas;
    }
    
    //Setter 
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    //ToString
    @Override
    public String toString() {
        return ("A loja " + super.getNome() + "de bijuterias, possuí " + super.getQuantidadeFuncionarios() + " funcionários com a base salárial de " + super.getSalarioBaseFuncionario() + "R$ por funcionário. A loja foi fundada em " + super.getDataFundacao() + ", está é sua localidade: " + super.getEndereco() + " e sua meta de vendas é: " + metaVendas + ".");
    }
    
    
}
