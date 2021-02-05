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
			System.out.println("Operação escolhida: Soma. Resultado: "+c);
			break;
		case '-':
			c = a - b;
			System.out.println("Operação escolhida: Subtração. Resultado: "+c);
			break;
		case '*':
			c = a * b;
			System.out.println("Operação escolhida: Multiplicação. Resultado: "+c);
			break;
		case '/':
			c = a / b;
			System.out.println("Operação escolhida: Divisão. Resultado: "+c);
			break;

		default:
			System.out.println("Operação inválida");
			break;
		}
	}
}
