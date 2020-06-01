package modelo;

public class Printer {

	
	private static Printer printer;
	
	private Printer() {
		//Construtor privado para evitar que seja instanciado por qualquer um.
	}
	
	public static Printer getInstance() { //Método static para acessar instancia que contem o objeto.
		if(printer == null) {
			printer = new Printer();
		}
		
		return printer;
	}
}
