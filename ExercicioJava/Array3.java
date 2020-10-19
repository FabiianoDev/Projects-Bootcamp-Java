//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
package ExercicioJava;

import java.util.Scanner;

public class Array3 {
	public static void main(String args[]) {
		
		int x, y, maiorQ10;
		int[][] vetor = new int[3][3];
		
		maiorQ10 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os numeros do Vetor");
		for(x=0;x<3;x++) {
			System.out.println("Para a "+(x+1)+"° linha:");
			for(y=0;y<3;y++) {
				System.out.println("Para a "+(y+1)+"° coluna:");
				vetor[x][y] = entrada.nextInt();
				if(vetor[x][y] > 10) {
					maiorQ10++;
				}
			}
		}
		
		System.out.println("A Matriz ficou: ");
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				System.out.println("["+vetor[x][y]+"]");
			}
		}
		System.out.println("A matriz possui "+maiorQ10+" valores maiores do que 10.");
		
		
	}

}
