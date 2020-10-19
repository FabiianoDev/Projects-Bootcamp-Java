/*6. Implemente a classe Vendedor como subclasse da classe Pessoa. 
Um determinado vendedor tem como atributos da classe Pessoa e também os atributos 
próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos) 
e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor). */

package POO2exer6;

public class Vendedor extends Pessoa {
	private double salarioBase;
	private double valorVendas;
	private double comissao;
	private double salarioTotal;
	
	public Vendedor (String nome, String endereco, String cpf, int telefone, int idade, double salarioBase, double valorVendas
			, double comissao, double salarioTotal) {
		super(nome,endereco,cpf,telefone,idade);
		this.salarioBase = salarioBase;
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salarioTotal = salarioTotal;
		
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do Vendedor: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco()+"\n"+"Salario Base: "+salarioBase+"\n"+"Valor de Vendas: "+valorVendas+"\n"+"Comissao: "+comissao
		+"\n"+"Salário Total: "+salarioTotal);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	
}
