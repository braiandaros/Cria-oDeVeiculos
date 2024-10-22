package veiculo;

public class Carro extends Veiculo{
	
	int Portas;
	boolean Estepe;
	
	public Carro(String Marca, String Modelo, int ano, String Combustivel, int Portas, boolean Estepe) {
		super(Marca, Modelo, ano, Combustivel);
		this.Portas = Portas;
		this.Estepe = Estepe;
	}
	
	public int getPorta() {
		return Portas;
	}
	
	public String getEstepe() {
		if(Estepe) {
			return " tem estepe";
		}
		else {
			return " não tem estepe";
		}
	}
	
	@Override
	public void Ligar() {
		System.out.println("O carro " + getModelo() + " esta sendo ligado.");
		System.out.println("Carro ligado");
	}
	
	@Override 
	public void Desligar(){
		System.out.println("O carro " + getModelo() + " esta sendo desligado.");
		System.out.println("Carro desligado");
	}
}
