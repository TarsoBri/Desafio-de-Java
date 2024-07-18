
/*
    Author: Tarso Brietzke Ircet

    Loja
 */

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    // Construtores:
   public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        
    }
    
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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
   
    
    // ToString: 
    public String toString() {
        return ("A loja " + nome + ", possuí " + quantidadeFuncionarios + " funcionários com a base salárial de " + salarioBaseFuncionario + "R$ por funcionário.");
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
