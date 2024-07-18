
/** 
 * @author (Tarso Brietzke Iracet) 
 
 */
public class Informatica extends Loja{
    private double seguroEletronicos;     
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja);      
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
        return ("A loja " + super.getNome() + "de informática, possuí " + super.getQuantidadeFuncionarios() + " funcion�rios com a base sal�rial de " + super.getSalarioBaseFuncionario() + "R$ por funcion�rio. A loja foi fundada em " + super.getDataFundacao() + ", est� � sua localidade: " + super.getEndereco() + " e possu� um seguro que lojas que vendem aparelhos eletr�nicos devem pagar mensalmente, com o valor de: " + seguroEletronicos + ".");
    }
    
    
}
