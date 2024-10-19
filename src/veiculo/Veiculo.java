package veiculo;

public class Veiculo {
	
	interface operavel{
		void Ligar();
		void Desligar();
		void Acelerar();
		void Frear();
	}
	
	protected String Marca;
	protected String Modelo;
	protected int Ano;
	protected String Combustivel;
	
	public Veiculo(String Marca, String Modelo, int Ano, String Combustivel) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.Ano = Ano;
		this.Combustivel = Combustivel;
	}
	
	public String getModelo() {
		return Modelo;
	}
	
	public void Ligar() {
		System.out.println();
	}
	
}
