package POO3exer1e2;

public class TesteAnimais {
		public static void main(String args[]) {
			
			System.out.println(">Cachorro<");
			Cachorro cachorro = new Cachorro("Rex",7);
			System.out.println("Emitir som: "+cachorro.emitirSom());
			System.out.println("Ação: "+cachorro.faz());
			
			System.out.println("\n>Cavalo<");
			Cavalo cavalo  = new Cavalo("Pé de Pano",20);
			System.out.println("Emitir som: "+cavalo.emitirSom());
			System.out.println("Ação: "+cavalo.faz());
			
			System.out.println("\n>Bixo preguiça<");
			Preguica preguica  = new Preguica("Flash",16);
			System.out.println("Emitir som: "+preguica.emitirSom());
			System.out.println("Ação: "+preguica.faz());
			
		}
}
