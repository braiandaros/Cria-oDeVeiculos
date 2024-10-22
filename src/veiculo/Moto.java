package veiculo;

public class Moto extends Veiculo{

	
	public Moto(String Marca, String Modelo, int Ano, String Combustivel) {
		super(Marca, Modelo, Ano, Combustivel);
	}
	
	@Override
	public void Ligar() {
		System.out.println("A moto " + getModelo() + " esta sendo ligada.");
		System.out.println("Moto ligada");
	}
	
	@Override 
	public void Desligar(){
		System.out.println("A moto " + getModelo() + " esta sendo desligada.");
		System.out.println("Moto desligada");
	}
}