package dibujos;

public class Triangulo2 {
	public static void main(String[] args) {
		int filas = 0;
		int total_filas = 7; // Tenemos 7 filas.
		int columnas;
		while (filas <= total_filas) {
			columnas = total_filas - filas;

			while (columnas > 0) {
				System.out.print('*');
				columnas--;
			}

			System.out.println('*');
			filas++;
		}
	}
}
