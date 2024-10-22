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
	public String getMarca() {
		return Marca;
	}
	public int getAno() {
		return Ano;
	}
	public String getCombustivel() {
		return Combustivel;
	}
	
	public void Ligar() {
		System.out.println("O veiculo " + getModelo() + "esta sendo ligado.");
		System.out.println("veiculo ligado");
	}
	
	public void Desligar() {
		System.out.println("O veiculo " + getModelo() + "esta sendo deligado.");
		System.out.println("veiculo desligado");
		
	}
}
