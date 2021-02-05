package ex10;

import java.util.Scanner;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Programa de calculadora usando threads");
		System.out.println("Digite o primeiro n�mero: ");
		double a = sc.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double b = sc.nextDouble();
		System.out.println("Digite a opera��o desejada\n'+' para soma, '-' para subtra��o, '*' para multiplica��o e '/' para divis�o: ");
		char op = sc.next().charAt(0);
		sc.close();
		
		Calculadora calculadora = new Calculadora(a, b, op);
		Thread t1 = new Thread(calculadora);
		
		t1.start();
	}

}
