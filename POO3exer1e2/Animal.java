package POO3exer1e2;

public class Animal {
	
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public String emitirSom(String som) {
		return som;
	}
	
	public String faz(String acao) {
		return acao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void addIdade() {
		this.setIdade(this.idade++);
	}

}