//Ler 10 números e imprimir quantos são pares e quantos são ímpares

package Dia3;

import java.util.*;

public class Exercicio2 {
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		int num,contImpar=0, contPar=0;
		
		for( int i = 1; i <= 10; i++)
		{
		System.out.println("Digite o " + i + "º Número: ");
		num = leia.nextInt();
		
		if(num % 2 ==0)
		{
			contPar++; 
		}
		if(num % 2 ==1)
		{
			contImpar++; 
			
		}
	}
		System.out.println("\nForam digitados " + contPar + " números pares \n");
		System.out.println("E " + contImpar + " números ímpares");
	}
	
}
