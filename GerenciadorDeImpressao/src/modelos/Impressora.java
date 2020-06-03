package modelos;

public class Impressora {

	
	private static Impressora impressora; //Tipo static para poder ser acessado pleo método tambem static.
	
	private Impressora() {
		//Construtor privado para evitar que seja instanciado por qualquer um.
	}
	
	public static Impressora getInstance() { //Método static para acessar instancia que contem o objeto.
		if(impressora == null) {
			impressora = new Impressora();
		}
		
		return impressora;
	}
}
