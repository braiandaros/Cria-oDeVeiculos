package veiculo;

public class Main {

	public static void main(String[] args) {
		Moto veiculo = new Moto ("honda","cg160",2019, "gasolina/alcool");
		System.out.println(veiculo.Combustivel);
		
		veiculo.Ligar();
		}

}
