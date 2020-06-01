package singleton;

import modelo.Printer;

public class PrintManager {

	public static void main(String[] args) {
		
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		Printer p3 = Printer.getInstance();
		Printer p4 = Printer.getInstance();
		
		System.out.println("Endereço de memória da impressora 1: "+p1);
		System.out.println("Endereço de memória da impressora 2: "+p2);
		System.out.println("Endereço de memória da impressora 3: "+p3);
		System.out.println("Endereço de memória da impressora 4: "+p4);

	}

}
