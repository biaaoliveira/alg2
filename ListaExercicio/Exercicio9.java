// Leia 10 números em uma array, pergunte ao usuário um número a ser procurado. Assim que
//localizar, imprimir qual a localização do número na array.

package ListaExercicio;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);

			int vet[] = new int[10];
			int ordem = 1, num = 0;

			System.out.println("Digite 10 números: ");
			for (int i = 0; i < vet.length; i++) {
				System.out.println("Digite o " + ordem + "º número: ");
				vet[i] = input.nextInt();
				ordem = ordem + 1;
			}
			System.out.println("Digite um número para pesquisar em seu vetor:");
			num = input.nextInt();
			ordem = 1;
			for (int i = 0; i < vet.length; i++) {
				ordem = ordem + 1;
				if (vet[i] == num) {
					ordem = ordem - 1;
					System.out.println("O número que você procura, foi o " + ordem + "º número digitado");
				}
			}
		}
	}



