package POO3exer1e2;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public String emitirSom() {
		return super.emitirSom("Uiiiiirrrr...bpruu bpruu...");
	}
	
	public String faz() {
		return super.faz("Corre.");
	}
}