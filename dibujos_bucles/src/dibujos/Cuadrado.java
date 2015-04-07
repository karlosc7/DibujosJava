package dibujos;

public class Cuadrado {
	public static void main(String args[]) {
		int lineas = 5;

		// Cuadrado

		System.out.println("Cuadrado");
		System.out.println("--------\n");

		for (int i = 0; i < lineas; i++) {
			for (int j = 0; j < lineas; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}