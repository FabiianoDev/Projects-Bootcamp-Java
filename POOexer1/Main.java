/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package POO1ex1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		String modelo;
		int qtdePassageiros, velMax, velAtual;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Cadastre o avião: ");
		System.out.println("Nome do modelo: ");
		modelo =entrada.nextLine();
		
		System.out.println("Qual a capacidade de passageiros: ");
		qtdePassageiros = entrada.nextInt();
		System.out.println("Qual a velocidade máxima: ");
		velMax = entrada.nextInt();
		System.out.println("Qual a velocidade atual: ");
		velAtual = entrada.nextInt();
		
		entrada.close();
		
		Aviao aviao1 = new Aviao(modelo, qtdePassageiros, velMax, velAtual);
		
		System.out.println(aviao1.getDados());
	}
}
