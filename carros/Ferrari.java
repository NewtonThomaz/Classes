package carros;

public class Ferrari implements Veiculo{
	@Override
	public void ligar() {
		System.out.println("A FERRARI está ligando");
	}
	@Override
	public void desligar() {
		System.out.println("A FERRARI está desligando");
	}
	@Override
	public void manobrar() {
		System.out.println("A FERRARI está manobrando");
	}
	@Override
	public void engatar() {
		System.out.println("A FERRARI está engatando");
	}@Override
	public void acelerar() {
		System.out.println("A FERRARI está acelerando");
	}
	@Override
	public void frear() {
		System.out.println("A FERRARI está freiando");
	}
}