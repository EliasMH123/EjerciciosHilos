package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Hilo1 H1 = new Hilo1();
		Hilo2 H2 = new Hilo2();
		
		Thread T1 = new Thread(H1);
		Thread T2 = new Thread(H2);
		
		T1.start();
		T2.start();
	}
}
