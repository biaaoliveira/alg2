package ListaExercicio;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vet[] = new int[10];
		int ordem = 1, negativo = 0;

		System.out.println("Digite 10 números: ");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o " + ordem + "º número: ");
			vet[i] = input.nextInt();
			ordem = ordem + 1;
		}
		ordem = 0;
		for (int i = 0; i < vet.length; i++) {
			ordem = ordem + 1;
			if (vet[i] < 0) {
				negativo = negativo + 1;
				System.out.println("O " + ordem + " º número digitado foi négativo");
			}
		}

		System.out.println("Totalizando " + negativo + " número(s) négativo(s)");
	}
}
