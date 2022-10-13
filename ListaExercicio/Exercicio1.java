//Preenche um array de tamanho 10 com números lidos pelo teclado

package ListaExercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int n [] = new int [9];
	 
	for(int i = 0; i <= 9; i++) {
		System.out.println("Digite 10 números: ");
		n[i] = input.nextInt();
	}
	for(int i = 0; i <= 9; i++) {
		System.out.println(n[i]);
	}
	}
}
