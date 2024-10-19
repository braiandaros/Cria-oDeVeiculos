package veiculo;

public class Moto extends Veiculo{

	
	public Moto(String Marca, String Modelo, int Ano, String Combustivel) {
		super(Marca, Modelo, Ano, Combustivel);
	}
	
	@Override
	public void Ligar() {
		System.out.println(getModelo() + " esta ligando.");
	}
}
