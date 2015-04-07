package dibujos;

public class Rombo {
	public static void main(String[] args) {
		// Rombo

		int lineas = 5;
		System.out.println("\n\nRombo");
		System.out.println("------\n");

		for (int i = 1; i <= (lineas / 2) + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = (lineas / 2); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
