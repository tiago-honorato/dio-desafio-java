package desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		int parametroUm, parametroDois;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		parametroUm = sc.nextInt();
		System.out.println("Informe o segundo numero: ");
		parametroDois = sc.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
			
		}catch (Exception e) {
			
			System.out.println("Erro: "+e.getMessage());
			
		}
		
		
		sc.close();
	}
	
	private static void contar(int p1, int p2) throws ParametrosInvalidosException {
		
		if(p1 > p2) {
			
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			
		}
		
		int contagem = p2 - p1;
		
		for(int i = 1; i <= contagem; i++) {
			
			System.out.println("numero: " + i);
			
		}
		
	}
	
}








