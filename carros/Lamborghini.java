package carros;

public class Lamborghini implements Veiculo {
	@Override
	public void ligar() {
		System.out.println("A LAMBORGHINI está ligando");
	}
	@Override
	public void desligar() {
		System.out.println("A LAMBORGHINI está desligando");
	}
	@Override
	public void manobrar() {
		System.out.println("A LAMBORGHINI está manobrando");
	}
	@Override
	public void engatar() {
		System.out.println("A LAMBORGHINI está engatando");
	}@Override
	public void acelerar() {
		System.out.println("A LAMBORGHINI está acelerando");
	}
	@Override
	public void frear() {
		System.out.println("A LAMBORGHINI está freiando");
	}
}