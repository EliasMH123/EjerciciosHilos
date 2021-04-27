package ejercicio3;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Ingrese numero:");
		n=teclado.nextInt();
		teclado.close();
		int num = n;
		
		Hilo1 H1 = new Hilo1(num);
		
		Thread T1 = new Thread(H1);
		
		T1.start();
	}
}
