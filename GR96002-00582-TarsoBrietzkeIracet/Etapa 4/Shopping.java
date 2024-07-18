
/**
      @author Tarso Brietzke Iracet
 */
public class Shopping
{
    private String nome;
    private Endereco enderecoShopping;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco enderecoShopping, int maxLojas){
       this.nome = nome;
       this.enderecoShopping = enderecoShopping;
       this.lojas = new Loja[maxLojas];
    }
    
    // Getters 
    public String getNome() {
        return this.nome;
    }
    public Endereco getEndereco() {
        return this.enderecoShopping;
    }
    public Loja[] getLojas() {
        return this.lojas;
    }
    
    // Setters
    public void setNome(String nome) {
         this.nome = nome;
    }
    public void setEndereco(Endereco endereco) {
         this.enderecoShopping = endereco;
    }
    public void setLoja(Loja[] lojas) {
         this.lojas = lojas;
    }
    
    // ToString
    public String toString() {
        return "O shopping " + nome + ", que possuí capacidade de " + lojas.length + " lojas está localizado no endereco: " + enderecoShopping + "."; 
    }
    
    // Insere Loja
        public boolean insereLoja(Loja novaLoja) {
            for(int i = 0; i < lojas.length; i++){
                if(lojas[i] == null) {
                    lojas[i] = novaLoja; // Loja inserida
                    return true;
                }
            }
            return false; // Capacidade m�xima de lojas atingida.
        }
    
    // Remove Loja
        public boolean removeLoja(String nomeLoja) {
            for(int i  = 0; i < lojas.length; i++){
                if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                    lojas[i] = null; // Loja removida
                    return true;
                }
            }
            return false; // Nome de loja n�o encontrada na lista de lojas para ser removida.
        }
        
    // Quantidade de lojas por tipo
        public int quantidadeLojasPorTipo(String tipoDeLoja) {
            int qtdLojas = 0;
            
            for(int i = 0; i < lojas.length; i++) {

                if(lojas[i] != null && lojas[i].getClass().getSimpleName().equalsIgnoreCase(tipoDeLoja)) 
                    qtdLojas++; 
            }
            
            return qtdLojas > 0 ? qtdLojas : -1;
        }
    
    // Loja de inform�tica com seguro mais caro
        public Informatica lojaSeguroMaisCaro() {
            Informatica lojaMaisCara = null;
            double maiorValorSeguro = 0;

            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] instanceof Informatica) {
                    Informatica lojaInformatica = (Informatica) lojas[i];
                    double valorSeguro = lojaInformatica.getSeguroEletronicos();
                    if (lojaMaisCara == null || valorSeguro > maiorValorSeguro) {
                        lojaMaisCara = lojaInformatica;
                        maiorValorSeguro = valorSeguro;
                    }
                }
            }

            return lojaMaisCara;
        }
}
