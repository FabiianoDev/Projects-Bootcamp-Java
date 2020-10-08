package Dia2;

	import java.util.*;

public class ExercicioDois {
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		a = ler.nextInt();
		System.out.println("Insira o segundo valor: ");
		b = ler.nextInt();
		System.out.println("Insira o terceiro valor: ");
		c = ler.nextInt();
		
		if(a<b && b<c)
			System.out.printf("%d %d %d\n",a, b, c);
		
		else if(a<c && c<b)
			System.out.printf("%d %d %d\n",a, c, b);
		
		else if(b<a && a<c)
			System.out.printf("%d %d %d\n",b, a, c);
		
		else if(b<c && c<a)
			System.out.printf("%d %d %d\n",b, c, a);
		
		else if(c<a && a<b)
			System.out.printf("%d %d %d\n",c, a, b);
		
		else if(c<b && b<a)
			System.out.printf("%d %d %d\n",c, b, a);
		
	}
}
