package POO3exer1e2;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public String emitirSom() {
		return super.emitirSom("RRrrr... AU!");
	}
	
	public String faz() {
		return super.faz("Corre.");
	}
}