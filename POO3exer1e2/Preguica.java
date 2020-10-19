package POO3exer1e2;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public String emitirSom() {
		return super.emitirSom("AIiiiiiii...");
	}
	
	public String faz() {
		return super.faz("Sobe em árvores.");
	}
}