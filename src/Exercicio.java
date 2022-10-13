import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[5];
		int i = 0;
		int maior = vetor[0];

		// Pede o valor ao usuário e lê este valor
		for (i = 0; i < 5; i++) {
			System.out.println("Digite um valor inteiro para o vetor: ");
			vetor[i] = leitor.nextInt();
		}

		// Imprime o vetor
		for (i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}

		// Imprime o maior valor
		for (i = 0; i < 5; i++) {

			if (vetor[i] > maior) {
				maior = vetor[i];
			}

			for (i = 0; i < 5; i++) {
				if (vetor[i] == maior) {
					System.out.println("O maior número no vetor é: " + vetor[i]);
				}
			}
		}
	}

}
