//) Crie um programa que leia 6 valores inteiros pares e, em seguida, mostre na tela os valores lidos
//na ordem inversa.//

package ListaExercicio;

public class Exercicio8 {
	public static void main(String[] args) {
		
        int[] pares = {2,4,6,8,10,12};
 
        for (int i = pares.length - 1; i >= 0 ; i--) {
            System.out.println(pares[i]);
        }
    }
}
