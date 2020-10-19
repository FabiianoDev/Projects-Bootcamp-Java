package POO2exer6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String nome, endereco, cpf;
		int telefone, idade, opc;
		double salarioBase, comissao = 0.0, valorVendas = 0.0, venda, salarioTotal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Criando um novo vendedor:");
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite seu endereço: ");
		endereco = entrada.nextLine();
		System.out.println("Digite seu CPF: ");
		cpf = entrada.nextLine();
		System.out.println("Digite o telefone(apenas numeros): ");
		telefone = entrada.nextInt();
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		System.out.println("Digite o Salario Base: ");
		salarioBase = entrada.nextDouble();
		System.out.println("Digite a comissão: ");
		comissao = entrada.nextDouble();
		salarioTotal = salarioBase;
		
		Vendedor vendedor1 = new Vendedor(nome,endereco,cpf,telefone,idade,salarioBase,valorVendas,comissao,salarioTotal);
		
		System.out.println("Perfeito!, o vendedor está cadastrado!");
		do {
			System.out.println("\nGostaria de adicionar Vendas a este vendedor? ");
			System.out.println("Digite: 1 - sim / 2 - não");
			opc = entrada.nextInt();
		
			switch(opc) {
				case 1:
					System.out.println("Qual o valor da venda? ");
					venda = entrada.nextDouble();
					if(venda>0) {
						valorVendas = vendedor1.getValorVendas();
						valorVendas += venda;
						vendedor1.setValorVendas(valorVendas);
						salarioTotal = vendedor1.getSalarioBase()+(vendedor1.getValorVendas()*(vendedor1.getComissao()/100));
						vendedor1.setSalarioTotal(salarioTotal);
					}break;
				case 2:
					System.out.println("Obrigado! e Volte sempre!");
					break;
			}
		}while(opc == 1);
		System.out.println("As informações do vendedor são:");
		vendedor1.imprimirInfo();
	}

}
