
/** 
 * @author (Tarso Brietzke Iracet) 
 
 */
public class Alimentacao extends Loja{
    private Data dataAlvara;     
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, Data dataAlvara){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja);      
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
        return ("A loja " + super.getNome() + "de alimentação, possuí " + super.getQuantidadeFuncionarios() + " funcion�rios com a base sal�rial de " + super.getSalarioBaseFuncionario() + "R$ por funcion�rio. A loja foi fundada em " + super.getDataFundacao() + ", est� � sua localidade: " + super.getEndereco() + " e recebeu seu alvar� de funcionamento na data de: " + dataAlvara + ".");
    }
    
    
}
