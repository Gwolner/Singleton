package modelo;

public class Impressora {

	
	private static Impressora printer; //Tipo static para poder ser acessado pleo m�todo tambem static.
	
	private Impressora() {
		//Construtor privado para evitar que seja instanciado por qualquer um.
	}
	
	public static Impressora getInstance() { //M�todo static para acessar instancia que contem o objeto.
		if(printer == null) {
			printer = new Impressora();
		}
		
		return printer;
	}
}
