package ejercicio2;

public class Hilo1 extends Thread{
	
	private int[] nums;
	
	public Hilo1(int[] nums) {
		this.nums = nums;
	}
	
	@Override
	public void run() {
		int SUMA = 0;
		for(int N: nums) {
			SUMA = SUMA + N*N*N;
		}
		
		System.out.println("Resultado del Hilo 1");
		System.out.println("La suma de los cubos de la lista es : "+ SUMA);
		
	}

	

}
