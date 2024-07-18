
/** 
  @author (Tarso Brietzke Iracet) 
 
 */
public class Vestuario extends Loja{
    private boolean produtosImportados;     
    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, boolean produtosImportados, int maxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoDaLoja, dataFundacaoDaLoja, maxProdutos);      
        this.produtosImportados = produtosImportados;
    }
    
    // Getter
    public boolean getProdutosImportados(){
        return this.produtosImportados;
    }
    
    //Setter 
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    //ToString
    @Override
    public String toString() {
        return ("A loja " + super.getNome() + "de vestu�rios, possu� " + super.getQuantidadeFuncionarios() + " funcion�rios com a base sal�rial de " + super.getSalarioBaseFuncionario() + "R$ por funcion�rio. A loja foi fundada em " + super.getDataFundacao() + ", est� � sua localidade: " + super.getEndereco() + " e possu� produtos " + (produtosImportados ? "importados" : "nacionais") + ".");
    }
    
    
}
