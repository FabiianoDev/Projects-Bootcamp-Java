package Dia2;
/*Receber 3 dígitos e em seguida expor qual o número mais alto*/
	import java.util.Scanner;
public class ExercicioUm
{
	public static void main (String args[])
	{
		
	int a;
	int b;
	int c;
	int maior=0;
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite o primeiro número: ");
	a = input.nextInt();
	System.out.println("Digite o segundo número: ");
	b = input.nextInt();
	System.out.println("Digite o terceiro número: ");
	c = input.nextInt();
			
			if (a>b && a>c) {
				maior = a;
			}
			else if (b>a && b>c) {
				maior = b;
			}
			else if (c>b && c>a) {
				maior = c;
			}
		System.out.printf("O maior número é: %d\n: ", maior);
	}
}

