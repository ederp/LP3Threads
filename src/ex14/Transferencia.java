package ex14;

public class Transferencia implements Runnable {

	private Caixa caixa;

	public Transferencia(Caixa caixa) {
		super();
		this.caixa = caixa;
	}

	@Override
	public void run() {
		this.caixa.transferencia();
	}
	
	
}
