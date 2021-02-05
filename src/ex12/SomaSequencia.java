package ex12;

public class SomaSequencia implements Runnable{
	
	int x, y, z, cont = 1;
	
	public SomaSequencia(int x, int z) {
		super();
		this.x = x;
		this.z = z;
	}

	@Override
	public void run() {
		y = x;
		for(int i = x + 1; y < z; i++){
			y += i;
			cont++;
		}
		System.out.println("Precisamos somar "+cont+" números em sequência para que "+x+" seja igual ou maior que "+z);
	}

}
