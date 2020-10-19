/*4. Implemente a classe Administrador como subclasse da classe pessoa. 
Um determinado administrador tem como atributos da classe Pessoa e 
também os atributos próprios como ajudaDeCusto (ajudas referentes a viagens, estadias).*/

package POO2exer4;



public class Administrador extends Pessoa {
	private float salarioBase;
	private int ajudaDeCusto;
	private int auxilioTerno;
	
	public Administrador (String nome, String endereco, String cpf, int telefone, int idade, float salarioBase, int ajudaDeCusto, int auxilioTerno)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.salarioBase = salarioBase;
		this.ajudaDeCusto = ajudaDeCusto;
		this.auxilioTerno = auxilioTerno;
		
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco()+"\n"+"AjudaDeCusto: "+ajudaDeCusto+"\n"+"Auxilio Terno: "+auxilioTerno);
	}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getAuxilioTerno() {
		return auxilioTerno;
	}

	public void setAuxilioTerno(int auxilioTerno) {
		this.auxilioTerno = auxilioTerno;
	}
	
	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

}
