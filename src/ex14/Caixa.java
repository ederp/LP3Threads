package ex14;

public class Caixa {
	
	private double cedulas = 500.0;
	
	
	public void setCedulas(double cedulas) {
		this.cedulas = cedulas;
	}
	
	public double getCedulas() {
		return cedulas;
	}

	public void saque() {
		String nome = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println(nome+" usando o caixa");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.setCedulas(cedulas - 250);
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

	public void recarregaCedulas() {
		synchronized (this) {
			System.out.println("Recarregando cédulas do caixa eletrônico. Favor aguardar um instante...");
			try {
				Thread.sleep(10000);
				this.setCedulas(cedulas + 500.0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Caixa novamente disponivel");
		}
	}
}
