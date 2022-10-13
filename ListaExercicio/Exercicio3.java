/* Solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois o programa deve
descobrir e exibir qual a posição do elemento de maior valor. */

package ListaExercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int n = 8;
    int v[] = new int[n];
    int i; 
	 
    for (i=0; i<n; i++) {
        System.out.printf("Informe %do. valor de %d: ", (i+1), n);
        v[i] = input.nextInt();
      }
	
    int maior = v[0];
    for (i=0; i<n; i++) {
      if (v[i] > maior)
         maior = v[i];
    }
    System.out.printf("\n");
    for (i=0; i<n; i++) {
     if (v[i] == maior)
              System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
    }
}
}
