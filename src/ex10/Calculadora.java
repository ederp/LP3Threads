package ex10;

public class Calculadora implements Runnable {
	
	double a, b, c;
	char op;
	
	public Calculadora(double a, double b, char op) {
		super();
		this.a = a;
		this.b = b;
		this.op = op;
	}
	

	@Override
	public void run() {
		switch (op) {
		case '+':
			c = a + b;
			System.out.println("Opera��o escolhida: Soma. Resultado: "+c);
			break;
		case '-':
			c = a - b;
			System.out.println("Opera��o escolhida: Subtra��o. Resultado: "+c);
			break;
		case '*':
			c = a * b;
			System.out.println("Opera��o escolhida: Multiplica��o. Resultado: "+c);
			break;
		case '/':
			c = a / b;
			System.out.println("Opera��o escolhida: Divis�o. Resultado: "+c);
			break;

		default:
			System.out.println("Opera��o inv�lida");
			break;
		}
	}
}
