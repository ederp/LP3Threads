package ex12;

import java.util.Scanner;

public class SomaSequenciaPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo número (deve ser maior do que o primeiro): ");
		int b = sc.nextInt();
		while(b <= a) {
			System.out.println("Digite o segundo número: (deve ser maior do que o primeiro)");
			b = sc.nextInt();
		}
		sc.close();
		
		SomaSequencia ss = new SomaSequencia(a, b);
		Thread t1 = new Thread(ss);
		t1.start();
	}

}
