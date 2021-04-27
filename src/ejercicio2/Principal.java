package ejercicio2;

public class Principal {
	public static void main(String[] args) {
		int[] _numeros = {2, 7, 5, 4, 9, 3, 6, 8, 1, 10};
		
		Hilo1 H1 = new Hilo1(_numeros);
		
		Thread T1 = new Thread(H1);
		
		T1.start();
	}
}
