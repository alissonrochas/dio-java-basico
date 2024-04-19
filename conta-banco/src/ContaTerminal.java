import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    	    
            int numeroConta;
            String numeroAgencia, nomeCliente;
            double saldoConta;
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Por favor, digite o número da Conta");
            numeroConta = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Insira o número da Agencia");
            numeroAgencia = scanner.nextLine();
            
            System.out.println("Digite o nome do Cliente");
            nomeCliente = scanner.nextLine();
            
            System.out.println("Por fim, digite o Saldo da sua conta");
            saldoConta = Double.parseDouble(scanner.nextLine());
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " já está disponível para saque");
        
    }
}

