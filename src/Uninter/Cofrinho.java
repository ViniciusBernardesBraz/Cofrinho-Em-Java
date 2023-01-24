package Uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaDeMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m) {
		listaDeMoedas.add(m);
	}
	
	public void remover(Moeda m) {
		listaDeMoedas.remove(m);
	}
	
	public void listagemMoedas() {
		for(Moeda m : listaDeMoedas) {
			System.out.println(m);
		}
	}
	
	public void totalConvertido() {
		double total = 0;
		for(Moeda m : listaDeMoedas) {
			total += m.conveter();
		}
		System.out.println("O total Convertido Para Real: " + total);
	}
	
	
}
