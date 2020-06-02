package main;

import modelo.Impressora;

public class GerenciadorDeImpressao {

	public static void main(String[] args) {
		
		Impressora p1 = Impressora.getInstance();
		Impressora p2 = Impressora.getInstance();
		Impressora p3 = Impressora.getInstance();
		Impressora p4 = Impressora.getInstance();
			
		
		System.out.println("Endereço de memória de p1: "+p1);
		System.out.println("Endereço de memória de p2: "+p2);
		System.out.println("Endereço de memória de p3: "+p3);
		System.out.println("Endereço de memória de p4: "+p4);

	}

}
