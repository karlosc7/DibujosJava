package dibujos;

public class Triangulo {
	public static void main(String[] args) {
		int columnas;
		int total_filas = 7; // Tenemos 7 filas.
		int filas = total_filas;

		System.out.println('*');
		while (filas > 0) {
			// Pintamos los asteriscos de la línea
			filas--;
			columnas = total_filas - filas;

			while (columnas > 0) {
				System.out.print('*');
				columnas--;
			}

			System.out.println('*');
		}
	}
}
