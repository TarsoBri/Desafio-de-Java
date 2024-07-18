
/**
      @author Tarso Brietzke Iracet
 */

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoDaLoja;
    private Data dataFundacaoDaLoja;
    private Produto[] estoqueProdutos;  
    
    // Construtores:
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoDaLoja = enderecoDaLoja;
        this.dataFundacaoDaLoja = dataFundacaoDaLoja;
        this.estoqueProdutos = new Produto[maxProdutos];
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoDaLoja, Data dataFundacaoDaLoja, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.enderecoDaLoja = enderecoDaLoja;
        this.dataFundacaoDaLoja = dataFundacaoDaLoja;
        this.estoqueProdutos = new Produto[maxProdutos];  
    }

    // Getters:
    public String getNome() {
        return this.nome;
    }
    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }
    public Endereco getEndereco() {
        return this.enderecoDaLoja;
    }
    public Data getDataFundacao() {
        return this.dataFundacaoDaLoja;
    }
    public Produto[] getEstoqueProdutos() {
        return this.estoqueProdutos;    
    }

    // Setters:
    public void setNome(String nome) {
         this.nome = nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
         this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public void setEndereco(Endereco local) {
         enderecoDaLoja = local;
    }
    public void setDataFundacao(Data fundacao) {
         dataFundacaoDaLoja = fundacao;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    
    
    // ToString: 
    public String toString() {
        return ("A loja " + nome + ", possuí " + quantidadeFuncionarios + " funcionários com a base salárial de " + salarioBaseFuncionario + "R$ por funcionário. A loja foi fundada em " + dataFundacaoDaLoja + " e está é sua localidade: " + enderecoDaLoja + ". Estoque de produtos: "+ estoqueProdutos.length +".");
    }

    // GastosComSalario:
    public double gastosComSalario() {
        if (this.salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }

    // TamanhoDaLoja:
    public char tamanhoDaLoja() {
        int n = quantidadeFuncionarios;
        if (n >= 10 && n <= 30) {
            return 'M';
        } else if (n > 30) {
            return 'G';
        } else {
            return 'P';
        }
    }
    
    // Imprime produtos
    public void imprimeProdutos() {
        String textoProdutos = "";
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null){
                if(textoProdutos == ""){
                    textoProdutos = estoqueProdutos[i].toString();
                } else {
                    textoProdutos += " " + estoqueProdutos[i].toString();
                } 
            } 
        }
        
        System.out.println(textoProdutos);
    }
    
    // Insere produto
    public boolean insereProduto(Produto novoProduto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = novoProduto; // Produto inserido.
                return true;
            } 
        }
        return false; // Estoque cheio.
    }
    
    // Remove produto
    public boolean removeProduto(String nomeProduto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null; // Produto removido
                return true; 
            }
        }
        return false; // Produto não encontrado.
    }
}   
