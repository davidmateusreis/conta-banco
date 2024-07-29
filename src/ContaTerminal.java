import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o nome do cliente: ");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}