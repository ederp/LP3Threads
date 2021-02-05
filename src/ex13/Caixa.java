package ex13;

public class Caixa{

	public void saque() {
		String nome = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println(nome+" usando o caixa");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.out.println("Saque efetuado com sucesso pelo "+nome);
		}
	}

	public void transferencia(){
		String nome = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println(nome+" usando o caixa");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Transferência efetuada com sucesso pelo "+nome);
		}
	}
}
