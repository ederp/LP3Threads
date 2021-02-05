package ex11;

import java.util.Scanner;

public class ConsvogPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase qualquer: ");
		String s = sc.nextLine();
		sc.close();
		
		Consvog contador = new Consvog(s);
		Thread t1 = new Thread(contador);
		t1.start();
	}

}
