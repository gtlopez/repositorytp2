package fi.unju.edu.ar.Punto07;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		int j;
		int i;
		System.out.println("Salida de la Serie: ");
		for (j = 40, i = 2; j > 0; j--,i++) {
			System.out.print(j*i + " ");
		}
	}
}
