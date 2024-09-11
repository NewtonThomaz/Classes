package cadeiraObj;

public class CadeiraObj {

	public static void main(String[] args) {
		Cadeira cadeira01 = new Cadeira();
		
		cadeira01.setCor("Preto");
		cadeira01.setMaterial("Couro");
		cadeira01.setPreco(1450);
		cadeira01.setPeso(200);
		cadeira01.setGirar("esquerda");
		cadeira01.setSubir("mais 5 cm");
		cadeira01.setDescer("não descer");
		cadeira01.setInclinar("mais 5 graus");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(cadeira01.getCor());
		System.out.println(cadeira01.getMaterial());
		System.out.println(cadeira01.getPreco());
		System.out.println(cadeira01.getPeso());
		System.out.println(cadeira01.getGirar());
		System.out.println(cadeira01.getSubir());
		System.out.println(cadeira01.getDescer());
		System.out.println(cadeira01.getInclinar());
	}
}