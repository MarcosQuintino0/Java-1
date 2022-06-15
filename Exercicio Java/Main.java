import java.util.Scanner; //fazendo o import do scanner

public class Main {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);                  //dando um novo nome para o scanner
        Scanner entradaCredito = new Scanner(System.in);
        Scanner entradaDivida = new Scanner(System.in);
        
          //instanciando a classe Pessoa
       Pessoa pessoa = new Pessoa();
        System.out.println(" Pessoa ------------------------------ ");
        pessoa.setNome (entrada.nextLine());
        System.out.println("\n Qual é o seu telefone? ");
        pessoa.setTelefone(entrada.nextLine());                    //usando SET para poder alterar o valor das variaveis
        System.out.println("\n Qual é o seu Endereço? ");
        pessoa.setEndereco(entrada.nextLine());

        //outputs da classe pessoa
        System.out.println("\n"+pessoa.getNome());                       //Usando GET para poder pegar a variavel
        System.out.println(pessoa.getTelefone());
        System.out.println(pessoa.getEndereco());
        pessoa.comer(); 
        System.out.println("-----------------------------------------");

        //instanciando a classe Fornecedor 
        System.out.println("Fornecedor");

        Fornecedor fornecedor = new Fornecedor();
        System.out.println("\n Qual é o seu nome? ");
        fornecedor.setNome (entrada.nextLine());
        System.out.println("\n Qual é o seu telefone? ");
        fornecedor.setTelefone(entrada.nextLine());
        System.out.println("\n Qual a sua quantidade de crédito? ");       
        fornecedor.setValorCredito(entradaCredito.nextDouble());                           //usando scanner para a captura de dados do usuario
        System.out.println("\n De quanto é a sua divida? ");
        fornecedor.setValorDivida(entradaDivida.nextDouble());
        double obterSaldo=(fornecedor.obterSaldo());
        //outputs
        System.out.println("\nO nome do fornecedor é "+ fornecedor.getNome());              
        System.out.println("O telefone de contato do fornecedor é "+ fornecedor.getTelefone());       
        System.out.println("o saldo do fornecedor de "+fornecedor.getNome()+(" é " + fornecedor.obterSaldo()));                //outputs da classe Fornecedor
        
        if (obterSaldo < 0){
            System.out.println("Seu saldo é negativo gerencie melhor suas dividas");
        }else if(obterSaldo >0){
            System.out.println("Seu saldo é positivo parabéns");
        }
        fornecedor.comer();
        System.out.println("\n-----------------------------------------");

        //instanciando a classe empregado
        System.out.println("Empregado");

        Empregado empregado = new Empregado();

        System.out.println("\n Qual é o seu nome? ");
        empregado.setNome (entrada.nextLine());         
        System.out.println("\n Qual seu numero para contato? ");  
        empregado.setTelefone(entrada.nextLine());   
        System.out.println("\n Qual é o seu endereço? ");
        empregado.setEndereco(entrada.nextLine());
        System.out.println("\n Qual é o seu salário?? ");
        empregado.setSalarioBase(entrada.nextDouble());
        empregado.setImposto(0.3);
        //outputs
        System.out.println("O nome do empregado é: "+ empregado.getNome());
        System.out.println("O numero de contato do "+empregado.getNome()+(" é "+empregado.getTelefone()));
        System.out.println("O endereço do empregado "+empregado.getNome()+(" é "+empregado.getEndereco()));
        System.out.println("E o seu salário, contando o imposto é: " + empregado.calcularSalario());       
        empregado.comer();
        System.out.println("\n-----------------------------------------"); 

        //instanciar a classe administrador
        System.out.println("Administrador");

        Administrador adm = new Administrador();
        System.out.println("\n Qual é o seu nome Admistrador? ");
        adm.setNome(entrada.nextLine());
        adm.setAjudaDeCusto(" Você recebeu uma ajuda de custo para uma viajem a Malibu ");
        System.out.println("\nAdministrador "+ adm.getNome()+(" recebeu "+ adm.getAjudaDeCusto()));
        System.out.println("-----------------------------------------"); 


            //instanciando a classe operario
        System.out.println("Operário");

        Operario operario = new Operario();
        System.out.println("\n Qual é o seu nome Operario? ");
        operario.setNome(entrada.nextLine());
        System.out.println("\n Qual é o seu telefone de contato? ");
        operario.setTelefone(entrada.nextLine());   
        System.out.println("\n informe o valor da sua produção: ");
        operario.setValorProducao (entrada.nextDouble());
        System.out.println("\n informe a sua comissão? ");
        operario.setComissao(entrada.nextDouble());
        System.out.println("\n informe seu salário base: ");
        operario.setSalarioBase(entrada.nextDouble());
        System.out.println("Nome do operario contratado é: "+operario.getNome());
        System.out.println("Numero de contato é: "+operario.getTelefone());
        System.out.println("Valor total do seu salário será: " + operario.totalSalario());   
        System.out.println("Valor da produção sua produção será: " + operario.getValorProducao());               //outputs e calculos do valor da produção
        System.out.println(" -----------------------------------------"); 

            //instanciando a classe vendedor
        System.out.println("Vendedor ");

        Vendedor vendedor = new Vendedor();
        System.out.println("\n Qual é o seu nome? ");
        vendedor.setNome (entrada.nextLine());         
        System.out.println("\n Qual seu numero para contato? ");  
        vendedor.setTelefone(entrada.nextLine());   
        System.out.println("\n Qual é o seu endereço? ");
        vendedor.setEndereco(entrada.nextLine());
        System.out.println("\n informe o valor da venda?");
        vendedor.setValorVenda (entrada.nextDouble());
        System.out.println("informe o valor da sua comissão ");
        vendedor.setComissao(entrada.nextDouble());
        //outputs
        System.out.println("\nO nome do vendedor é: "+ vendedor.getNome());
        System.out.println("O numero de contato é: "+ vendedor.getTelefone());
        System.out.println("O endereço é: "+vendedor.getEndereco());
        System.out.println("Valor final do seu salário será: " + vendedor.finalSalario());  //outputs e calculos do salário do vendedor
        System.out.println("Valor da Venda: " + vendedor.getValorVenda());
        System.out.println("-----------------------------------------"); 

        entrada.close();                      //fechando entradas para não haver vazemento de recursos
        entradaCredito.close();
        entradaDivida.close(); 
    }
}
