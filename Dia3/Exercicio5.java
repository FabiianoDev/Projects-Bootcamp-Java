/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */

package Dia3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String args[])
	{
		Scanner  leia = new Scanner(System.in);
		
	int num,soma=0;
	
		do
		{
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			soma += num;
			
		}while(num!=0);
		
		System.out.printf("A soma dos números digitados são: %d",soma);
	}
}
