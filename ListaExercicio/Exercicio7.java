// Ler 10 salários. Depois de lidos e armazenados, mostre o maior valor. //

package ListaExercicio;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		

	Scanner input = new Scanner (System.in);
	int salario = 10;
	int vetor [] = new int[salario];
	
	for(int i = 0; i < salario; i++) {
		System.out.println("Digite 10 sálarios: ");
		vetor[i] = input.nextInt();
	}
	
	for(int i = 0; i < salario; i++) {
		System.out.println("Valores obtidos:" + vetor[i]);
}
	 int maior = vetor[0];
	    for (int i=0; i < salario; i++) {
	      if (vetor[i] > maior)
	         maior = vetor[i];
	    }
	    System.out.printf("\n");
	    for (int i=0; i<salario; i++) {
	     if (vetor[i] == maior)
	              System.out.printf("v[%d] = %2d <--- maior salario\n", i, vetor[i]);
	    }
}
}