/*) Solicita 5 valores ao usuário, armazena esses valores em um array chamado vet1 de inteiros.
Depois, copia o conteúdo desse array para um segundo array chamado vet2. O programa deve
imprimir os dois arrays na tela. */

package ListaExercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int n = 5;
	int vet1 [] = new int[n];
	int vet2 [] = new int[n];
	
	 for(int i = 0; i < n; i++) {
		 System.out.printf("Digite 5 valores:");
		 vet1[i] = input.nextInt();
		 
	 }

	 for(int i = 0; i < n; i++) {
	 System.out.println(vet1);
	 vet1[i] = vet2[i];
	 System.out.println(vet2);
	 }
	}
}

