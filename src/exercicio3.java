/* Leia um vetor de 20 posições
 * leia um valor X qualquer
 * Faça uma busca de X no vetor
 * informe a posição do vetor que X foi encontrado
 * ou diga que não foi encontrado
 */

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// declaraçao do vetor
		int[] vetor = new int[10];

		// declaracao de variavel
		int num;

		// entrada de dados -> vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor para a posição " + i);
			vetor[i] = in.nextInt();
		}

		// entrada de dados -> variável
		System.out.println("Digite um valor para procurar no vetor");
		num = in.nextInt();

		// leitura do vetor
		for (int i = 0; i < vetor.length; i++) {

			// se existir no vetor o número digitado
			if (vetor[i] == num) {
				System.out.println("O índice do número digitado é " + i);
				// se não existir...
			} else if (i == vetor.length - 1) {
				System.out.println("Número não encontrado no vetor");
			}
		}
	}
}