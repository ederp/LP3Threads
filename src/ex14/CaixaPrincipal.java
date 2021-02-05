package ex14;


public class CaixaPrincipal {

	public static void main(String[] args) throws InterruptedException {
		Caixa caixa = new Caixa();
		Thread cliente1 = new Thread(new Saque(caixa), "Cliente 1");
		Thread cliente2 = new Thread(new Saque(caixa), "Cliente 2");
		Thread cliente3 = new Thread(new Transferencia(caixa), "Cliente 3");
		Thread cliente4 = new Thread(new Saque(caixa), "Cliente 4");
		
		cliente1.start();
		cliente1.join();
		cliente2.start();
		cliente2.join();
		cliente3.start();
		cliente3.join();
		cliente4.start();
		cliente4.join();
		
	}

}
