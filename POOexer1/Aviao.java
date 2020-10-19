/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POOexer1;

public class Aviao {
	private String modelo;
	private int nPassageiros; 
	private int velocidadeMax;	
	private int velocidadeAtual;
	
	public Aviao (String model, int passageiros, int max, int atual) {
		modelo = model;
		nPassageiros = passageiros;
		velocidadeMax = max;
		velocidadeAtual = atual;
	}
	
	public String getDados() {
		String dados = "modelo: "+modelo+"\ncapacidade: "+nPassageiros+"\nVelocidade Máxima: "+velocidadeMax+"\nVelocidade Atual: "+velocidadeAtual;
		return dados;
	}
}
