/*
    Author: Tarso Brietzke Ircet

    Endereço
 */

public class Endereco {
    private String nomeDaRua, cidade, estado, pais, cep, numero, complemento;

    // Construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep,  String numero, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Getters
    public String getNomeDaRua() {
        return this.nomeDaRua;
    }
    public String getCidade() {
        return this.cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    public String getPais() {
        return this.pais;
    }
    public String getCep() {
        return this.cep;
    }
    public String getNumero() {
        return this.numero;
    }
    public String getComplemento() {
        return this.complemento;
    }

    // Setters 
    public void setNomeDaRua(String nomeDaRua) {
     this.nomeDaRua = nomeDaRua;
    }
    public void setCidade(String cidade) {
     this.cidade = cidade;
    }
    public void setEstado(String estado) {
     this.estado = estado;
    }
    public void setPais(String pais) {
     this.pais = pais;
    }
    public void setCep(String cep) {
     this.cep = cep;
    }
    public void setNumero(String numero) {
     this.numero = numero;
    }
    public void setComplemento(String complemento) {
     this.complemento = complemento;
    }

    // ToString
    public String toString() {
        return ("Rua: " + nomeDaRua + ", Cidade: " + cidade + ", Estado: " + estado + ", País: " + pais + ", CEP: " + cep + ", Número: " + numero + ", Complemento: " + complemento);
    }
}
