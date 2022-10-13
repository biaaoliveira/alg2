package ListaExercicio;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double vet[] = new double[20];
		double menor = 0;
		double soma = 0;
		int ordem = 1;

		System.out.println("Digite 20 números: ");

		for (double i = 0; i < vet.length; i++) {
			System.out.println("Informe o " + ordem + "º valor: ");
			vet[(int) i] = input.nextDouble();
			ordem = ordem + 1;
			soma = soma + vet[(int) i];
		}
		System.out.println("A média dos elementos digitados é: ");
		double media = soma / vet.length;
		System.out.println("Soma dos elementos: "+ soma + " / Quantidade dos elementos: " + vet.length + " = " + media);
		System.out.println("E o elementos menores do que a média foram: ");
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				menor = vet[i];
			System.out.println(menor);
			}
		}
	}
}
}
