package veiculo;

public class Carro extends Veiculo{
	
	int portas;
	boolean estepe;
	
	public Carro(String Marca, String Modelo, int ano, String Combustivel, int portas, boolean estepe) {
		super(Marca, Modelo, ano, Combustivel);
		this.portas = portas;
		this.estepe = estepe;
	}
	
}
