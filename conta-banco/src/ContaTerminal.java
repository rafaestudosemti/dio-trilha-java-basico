import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da sua conta:");
        int numeroconta = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        double saldo = 237.48;



        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroconta + " e o seu saldo $"+ saldo + " já está dísponível para saque.");

        scanner.close();
    }
}
