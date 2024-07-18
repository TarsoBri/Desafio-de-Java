/**
      @author Tarso Brietzke Iracet
 */

import java.util.Scanner;
public class Principal{
    
    public static String leString(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        String resposta = scanner.nextLine();
        scanner.close();
        
        return resposta;
    }
    public static int leInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        int resposta = scanner.nextInt();
        scanner.close();

        return resposta;
    }
    public static double leDouble(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        double resposta = scanner.nextDouble();
        scanner.close();
        
        return resposta;
    }
    
    public static void main(){
        
        int resposta = leInt("Digite: \n(1) Criar uma loja \n(2) Criar um produto \n(3) Sair");
        
        while(resposta != 1 && resposta != 2 && resposta != 3){
            System.out.println("Op��o inv�lida");
            
            resposta = leInt("Digite: \n(1) Criar uma loja \n(2) Criar um produto \n(3) Sair");
        }
        //Loja
        if(resposta == 1){
            System.out.println("Insira os dados da loja: ");
            
            String nome = leString("Nome: ");
            int quantidadeDeFuncionarios = leInt("Quantidade de funcion�rios:");
            double salarioBaseFuncionario = leDouble("Salario base dos funcion�rios:");
            
            //Endere�o
            System.out.println("Insira o endere�o da loja "+ nome +":");
            String rua = leString("Rua:");
            String cidade = leString("Cidade:");
            String estado = leString("Estado:");
            String pais = leString("Pa�s:");
            String cep = leString("CEP:");
            String numero = leString("N�mero:");
            String complemento = leString("Complemento:");
            
            //Data de funda��o
            System.out.println("Insira a data de funda��o da loja "+ nome +":");
            int dia = leInt("Dia:");
            int mes = leInt("M�s:");
            int ano = leInt("Ano:");
            
            // Estoque
            System.out.println("Insira o estoque m�ximo de produtos da loja "+ nome +":");
            int estoque = leInt("Estoque: ");
            
            Loja lojaInserida = new Loja(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, new Endereco(rua, cidade, estado, pais, cep, numero, complemento), new Data(dia, mes, ano), estoque);
            
            System.out.println(lojaInserida);
            System.out.println("--------------------");
            
            // Inserir produtos
            System.out.println("Quer inserir produtos a loja " + nome + "?");
            int resposta2 = leInt("Digite: \n(1) Sim \n(2) N�o e sair");
                        
            while(resposta != 1 && resposta != 2){
                System.out.println("Op��o inv�lida");
                
                resposta2 = leInt("Digite: \n(1) Sim \n(2) N�o e sair");
            }
            
            if(resposta2 == 1) {
                int resposta3 = 1;
                
                while(resposta3 == 1) {
                    
                    boolean estaCheio = true;
                    for(int i = 0; i < lojaInserida.getEstoqueProdutos().length; i++) {
                        if (lojaInserida.getEstoqueProdutos()[i] == null) {
                            estaCheio = false;
                            break;
                        }
                    }
                    
                    if(!estaCheio) {
                        System.out.println("Dados do produto:");
                        
                        String nomeProduto = leString("Nome: ");
                        double precoProduto = leDouble("Pre�o: ");
                        
                        System.out.println("Data de Validade: ");
                        int dataDiaProduto = leInt("Dia: ");
                        int dataMesProduto = leInt("M�s: ");
                        int dataAnoProduto = leInt("Ano: ");
                        
                        lojaInserida.insereProduto(new Produto(nomeProduto, precoProduto, new Data(dataDiaProduto, dataMesProduto, dataAnoProduto)));
                        
                        System.out.println("Seu estoque: ");
                        lojaInserida.imprimeProdutos();
                        
                        System.out.println("Quer inserir outro produto ao seu estoque?");
                        resposta3 = leInt("Digite: \n(1) Sim \n(2) N�o e sair");
                    } else { 
                        System.out.println("Estoque cheio!");
                        resposta3 = 2;
                    }
                
                    resposta2 = 2;
                } 
            }
            
            if(resposta2 == 2) {
                System.out.println("At� logo...");
            }
                
            
        } // Produto
        else if(resposta == 2){
            System.out.println("Insira os dados do produto: ");
            
            String nome = leString("Nome: ");
            double preco = leDouble("Preco: ");
            
            // Data de validade
            System.out.println("Insira a data de validade do produto "+ nome +":");
            int dia = leInt("Dia:");
            int mes = leInt("M�s:");
            int ano = leInt("Ano:");
            
            Produto produtoInserido = new Produto(nome, preco, new Data(dia, mes, ano));
            
            Data data = new Data(20, 10, 2023);
            if(produtoInserido.estaVencido(data)) {
                System.out.println(produtoInserido + " PRODUTO VENCIDO");
            } else {
                System.out.println(produtoInserido + " PRODUTO N�O VENCIDO");
            } // Sair
        } else {
            System.out.println("At� logo...");
        }
    }
        
    public static void main(String[] args){
        main();
    }
}