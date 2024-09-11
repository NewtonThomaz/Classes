package computadorObj;

public class ObjetoComputador {

	public static void main(String[] args) {
		/*placaMae, placaVideo, processador, memoria, refrigecao, ssd, hd, ligado, desligado;
		capSSD, capHD, capMemoria;*/
		Computador pc01 = new Computador();
		
		pc01.setPlacaMae("B550m");
		pc01.setPlacaVideo("4090Ti");
		pc01.setProcessador("i9 15th");
		pc01.setMemoria("kingston DDR5");
		pc01.setRefrigeracao("water cooler 360mm");
		pc01.setSSD("ssd kingston nv2");
		pc01.setHD("não apresenta");
		pc01.setCapSSD(1000);
		pc01.setCapHD(0);
		pc01.setCapMemoria(32);
		pc01.setLigado("sim");
		pc01.setDesligado("não");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(pc01.getPlacaMae());
		System.out.println(pc01.getPlacaVideo());
		System.out.println(pc01.getProcessador());
		System.out.println(pc01.getMemoria());
		System.out.println(pc01.getRefrigeracao());
		System.out.println(pc01.getSSD());
		System.out.println(pc01.getHD());
		System.out.println(pc01.getCapHD());
		System.out.println(pc01.getCapSSD());
		System.out.println(pc01.getCapMemoria());
		System.out.println(pc01.getLigado());
		System.out.println(pc01.getDesligado());
	}
}