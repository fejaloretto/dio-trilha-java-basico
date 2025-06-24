import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //TODO: Implementar a classe ContaTerminal: conhecer e importar a classe Scanner
        //exibir as mensagens para nosso usuário
        //obter pela scanner os valores necessários para criar uma conta digitados no terminal
        //exibir a mensagem final da conta criada com sucesso
        var scanner = new Scanner(System.in);
        System.out.println("Olá! Bem-vindo ao sistema bancário. Por favor digite seu nome:");
        String nomeCliente = scanner.next();
        System.out.printf("%s, por favor, digite o número da Agência: \n", nomeCliente);
        String numAgencia = scanner.next();
        System.out.println("Qual o número da sua Conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo a depositar na conta: ");
        double saldo = scanner.nextDouble();
        

        System.out.printf("Olá %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo de %s já está disponível para saque.", nomeCliente, numAgencia, numeroConta, saldo);
    }
}
