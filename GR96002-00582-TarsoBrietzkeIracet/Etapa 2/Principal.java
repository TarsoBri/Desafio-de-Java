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
            System.out.println("Opççao inválida");
            
            resposta = leInt("Digite: \n(1) Criar uma loja \n(2) Criar um produto \n(3) Sair");
        }
        //Loja
        if(resposta == 1){
            System.out.println("Insira os dados da loja: ");
            
            String nome = leString("Nome: ");
            int quantidadeDeFuncionarios = leInt("Quantidade de funcionários:");
            double salarioBaseFuncionario = leDouble("Salario base dos funcionários:");
            
            //Endere�o
            System.out.println("Insira o endereço da loja "+ nome +":");
            String rua = leString("Rua:");
            String cidade = leString("Cidade:");
            String estado = leString("Estado:");
            String pais = leString("País:");
            String cep = leString("CEP:");
            String numero = leString("Número:");
            String complemento = leString("Complemento:");
            
            //Data de funda��o
            System.out.println("Insira a data de fundação da loja "+ nome +":");
            int dia = leInt("Dia:");
            int mes = leInt("Mês:");
            int ano = leInt("Ano:");
            
            
            Loja lojaInserida = new Loja(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, new Endereco(rua, cidade, estado, pais, cep, numero, complemento), new Data(dia, mes, ano));
            System.out.println(lojaInserida);
        } // Produto
        else if(resposta == 2){
            System.out.println("Insira os dados do produto: ");
            
            String nome = leString("Nome: ");
            double preco = leDouble("Preco: ");
            
            // Data de validade
            System.out.println("Insira a data de validade do produto "+ nome +":");
            int dia = leInt("Dia:");
            int mes = leInt("Mês:");
            int ano = leInt("Ano:");
            
            Produto produtoInserido = new Produto(nome, preco, new Data(dia, mes, ano));
            
            Data data = new Data(20, 10, 2023);
            if(produtoInserido.estaVencido(data)) {
                System.out.println(produtoInserido + " PRODUTO VENCIDO");
            } else {
                System.out.println(produtoInserido + " PRODUTO NÃO VENCIDO");
            } // Sair
        } else {
            System.out.println("Até logo...");
        }
    }
        
    public static void main(String[] args){
        main();
    }
}