package ex14;

public class Saque implements Runnable{

	private Caixa caixa;

	public Saque(Caixa caixa) {
		super();
		this.caixa = caixa;
	}

	@Override
	public void run() {
		this.caixa.saque();
		if(caixa.getCedulas() <= 0) {
			caixa.recarregaCedulas();
		}
	}
	
	
}
