//Preenche um array de tamanho 10 com números lidos pelo teclado e mostre os valores lidos

package ListaExercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num = 10;
	int n [] = new int [num];
	 
	for(int i = 0; i < num; i++) {
		System.out.println("Digite 10 números: ");
		n[i] = input.nextInt();
	}
	
	for(int i = 0; i < num; i++) {
		System.out.println("Valores obtidos:" + n[i]);
	}
}
}