import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[][] m = new int[4][4];
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = rd.nextInt(100);
				System.out.println(m[i][j] + "");
			}
			System.out.println();
		}

		int par = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] % 2 == 0) {
					par = m[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("Os números pares são: " + par);
		System.out.println("Na linha: " + linha);
		System.out.println("Coluna: " + coluna);

	}
}
