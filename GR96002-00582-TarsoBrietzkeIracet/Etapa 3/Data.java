
/* 
  Author: Tarso Brietzke Iracet

  Data
 */

public class Data {
    private int dia, mes, ano;
    
    // Construtor
    public Data(int dia, int mes, int ano) {
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    if (!validarData()) {
        System.err.println("Erro: Datas inválidas.");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }
    }

    // Getters 
    public int getDia() {
        return this.dia;
    }
    public int getMes() {
        return this.mes;
    }
    public int getAno() {
        return this.ano;
    }

    // Setters 
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Validar Data
    private boolean validarData() {
        if ( mes < 1 || mes > 12 || ano < 1) return false;

        else if (mes == 2) { // Verificar dias
        if (verificaAnoBissexto()) { 
          if(dia < 1 || dia > 29) return false;
      
        } else {
          if (dia < 1 || dia > 28) return false;            
        }
        
      } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
        if (dia < 1 || dia > 30) return false;
        
      } else {
        if (dia < 1 || dia > 31) return false;
      }

      return true;
    }

    // VerificaAnoBissexto
    public boolean verificaAnoBissexto(){
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }

    // ToString
    public String toString(){
    String diaFormatado = (dia < 10) ? "0" + dia : String.valueOf(dia);
    String mesFormatado = (mes < 10) ? "0" + mes : String.valueOf(mes);
    
    return diaFormatado + "/" + mesFormatado + "/" + ano;
    }
}
