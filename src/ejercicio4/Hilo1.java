package ejercicio4;

public class Hilo1 extends Thread{
	
	private String cadena;
	
	public Hilo1(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public void run(){
		System.out.println("\n--> "+cadena+" terminó la carrera\n");
		
	}
	
}
