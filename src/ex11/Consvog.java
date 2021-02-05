package ex11;

public class Consvog implements Runnable{
	
	String frase, vogal = "aeiou", consoante = "qwrtypsdfghjklçzxcvbnm";
	int vog = 0, cons = 0;
	
	public Consvog(String frase) {
		super();
		this.frase = frase.toLowerCase();
	}

	@Override
	public void run() {
		for(int i = 0; i < frase.length(); i++) {
			String c = frase.substring(i, i + 1);
			if(vogal.contains(c)) vog++;
			if(consoante.contains(c)) cons++;
		}
		System.out.println("A frase contém "+vog+" vogais e "+cons+" consoantes");
	}

}
