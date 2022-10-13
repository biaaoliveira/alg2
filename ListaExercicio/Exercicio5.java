package ListaExercicio;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetor1[] = new int[5];
		int vetor2[] = new int[vetor1.length];
		int ordem = 1;

		System.out.println("Preencha com 05 números inteiros: ");

		for (int i = 0; i < vetor1.length; i++) {
		System.out.println("Informe o " + ordem + "º valor: ");
			vetor1[i] = input.nextInt();
			ordem = ordem + 1;
		}
		for (int j = 0; j < vetor1.length; j++) {
			int invert = vetor1.length - 1 - j;
			vetor2[j] = vetor1[invert];
		}
		System.out.println("\nOs valores digitados do vetor 1 foram:\n");
		ordem = 1;
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println(ordem + "º Valor: " + vetor1[i]);
			ordem = ordem + 1;
		}
		System.out.println("\nOs valores invertidos e copiados para o vetor 2 foram:\n");
		ordem = 1;
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println(ordem + "º Valor: " + vetor2[i]);
			ordem = ordem + 1;
		}
	}
}
}
