package ejercicio3;

public class Hilo1 extends Thread{
	private int num;
	
	public Hilo1(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		int FACT = 1;
		for(int i=num;i>=1;i--) {
			FACT = FACT * i;
		}
		System.out.println("Resultado del Hilo 1");
		System.out.println("Factorial del numero: "+FACT);
		
	}
	
	
}
