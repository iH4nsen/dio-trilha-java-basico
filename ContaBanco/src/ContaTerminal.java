import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta!");
        int numero = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite a agência!");
        String agencia = sc.nextLine();

        System.out.println("Digite o nome do cliente!");
        String nome = sc.nextLine();

        System.out.println("Digite o saldo da conta!");
        double saldo = sc.nextDouble();
        sc.nextLine(); 

        String mensagem = "Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
        
        sc.close();
    }
}
