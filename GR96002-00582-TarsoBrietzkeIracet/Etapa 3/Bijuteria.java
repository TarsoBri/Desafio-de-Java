
/** 
 * @author (Tarso Brietzke Iracet) 
 
 */
public class Bijuteria extends Loja{
    private double metaVendas;     
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja);      
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
        return ("A loja " + super.getNome() + "de bijuterias, possuí " + super.getQuantidadeFuncionarios() + " funcion�rios com a base sal�rial de " + super.getSalarioBaseFuncionario() + "R$ por funcion�rio. A loja foi fundada em " + super.getDataFundacao() + ", est� � sua localidade: " + super.getEndereco() + " e sua meta de vendas é: " + metaVendas + ".");
    }
    
    
}
