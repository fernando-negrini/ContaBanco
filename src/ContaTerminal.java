import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
    
        // Declaração de variáveis
        int NumeroConta;
        String NomeCliente;
        String Agencia;
        Double Saldo;
        Saldo = 237.48;

        // Sintaxe do código
        Scanner entrada = new Scanner(System.in);
        // Exibir as mensagens para nosso usuário e coletar os dados que preencherão o espaço das variáveis
        System.out.println("Por favor digite o número da agencia: ");
        Agencia = entrada.next();

        System.out.println("Agora  digite o número da Conta: ");
        NumeroConta = entrada.nextInt();

        System.out.println("Por favor digite o seu nome completo: ");
        NomeCliente = entrada.nextLine();

       // exibindo mensagem para o cliente
       System.out.println("Olá "+ NomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é a : "+ Agencia + " , conta "+ NumeroConta+ " e seu saldo é de R$ "+Saldo+" já disponível para saque!!");

        entrada.close();

    }
}
