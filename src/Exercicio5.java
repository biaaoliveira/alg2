public class Exercicio5 {
	public static void main(String[] args) {
		int[][] matriz = new int[][] { { 6, 6, 5 },
			{ 6, 5, 3 } };

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (matriz[j] == matriz[i]) {
					System.out.print("Há elementos repetidos.");
				} else if (matriz[j] != matriz[i]) {
					System.out.print("Não há elementos repetidos.");
				}

				System.out.println();
			}
		}
	}
}
