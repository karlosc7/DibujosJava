package dibujos;

public class Abeto {

	public static void main(String[] args) {
		// Abeto
		int lineas = 5;
		System.out.println("\n\nAbeto");
		System.out.println("------\n");

		int contador = 1;
		for (int i = 1; i <= lineas; i++) {
			contador++;
			for (int j = 1; j <= contador; j++) {
				for (int k = 0; k < j; k++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		System.out.println("**");
		System.out.println("**");
	}

}
