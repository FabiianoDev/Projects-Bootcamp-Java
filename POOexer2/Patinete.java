package POOexer2;

public class Patinete {
	private String nome;
	private String marca;
	private String cor;
	private int largura; 
	private int altura;	
	private int idadeMax;
	
	public Patinete (String nomeX, String marcaX, String corX, int larguraX, int alturaX, int idadeMaxX) {
		nome = nomeX; 
		marca = marcaX; 
		cor = corX; 
		largura = larguraX; 
		altura = alturaX; 
		idadeMax = idadeMaxX;
	}
	
	public String getDados() {
		String dados = "Nome: "+nome+"\nMarca: "+marca+"\nCor: "+cor+"\nLargura: "+largura+"\nAltura: "+altura+"\nIdade M[axima permitida: "+idadeMax;
		return dados;
	}
}
