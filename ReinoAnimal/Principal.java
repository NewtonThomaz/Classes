package ReinoAnimal;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo();
		Cachorro cachorro = new Cachorro();
		
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emiterSom();
		
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emiterSom();
	}
}