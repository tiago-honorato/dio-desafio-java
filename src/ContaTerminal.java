import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		String nome, agencia;
		int numeroConta;
		double saldo;
		
		System.out.println("Informe o nome do usuario: ");
		
		Scanner sc = new Scanner(System.in);
			
		nome = sc.next();
		
		System.out.println("Informe a agencia do usuario: ");
		
		agencia = sc.next();
		
		System.out.println("Informe o numero da conta do usuario: ");
		
		numeroConta = sc.nextInt();
		
		System.out.println("Informe o saldo do usuario: ");
		
		saldo = sc.nextDouble();
		
		System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s"
				+ ", conta %d e seu saldo %.2f ja esta disponivel para saque", nome, agencia, numeroConta, saldo);
		
		sc.close();
		
	}
	
}
