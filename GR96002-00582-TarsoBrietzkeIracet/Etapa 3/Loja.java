
/*
    Author: Tarso Brietzke Ircet

    Loja
 */

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoDaLoja;
    private Data dataFundacaoDaLoja;
    
    // Construtores:
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoDaLoja, Data dataFundacaoDaLoja) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoDaLoja = enderecoDaLoja;
        this.dataFundacaoDaLoja = dataFundacaoDaLoja;
        
    }
    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoDaLoja, Data dataFundacaoDaLoja) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.enderecoDaLoja = enderecoDaLoja;
        this.dataFundacaoDaLoja = dataFundacaoDaLoja;
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
    
    // ToString: 
    public String toString() {
        return ("A loja " + nome + ", possuí " + quantidadeFuncionarios + " funcionários com a base sal�rial de " + salarioBaseFuncionario + "R$ por funcion�rio. A loja foi fundada em " + dataFundacaoDaLoja + " e est� � sua localidade: " + enderecoDaLoja);
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

}   
