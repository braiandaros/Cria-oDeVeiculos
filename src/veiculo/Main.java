package veiculo;

public class Main {

	public static void main(String[] args) {
		Moto CG160 = new Moto ("honda","cg160",2019, "gasolina/alcool");
		Carro Hilux = new Carro("toyota","Hilux srv", 2019, "diesel", 4, true);
		
		System.out.println(CG160.Combustivel);
		System.out.println(Hilux.Combustivel);
		
		CG160.Desligar();
		Hilux.Ligar();
		
		System.out.println("O carro " + Hilux.getModelo() + Hilux.getEstepe());
		}

}