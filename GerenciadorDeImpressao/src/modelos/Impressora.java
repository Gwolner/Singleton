package modelos;

public class Impressora {

	
	private static Impressora impressora; //Tipo static para poder ser acessado pleo m�todo tambem static.
	
	private Impressora() {
		//Construtor privado para evitar que seja instanciado por qualquer um.
	}
	
	public static Impressora getInstance() { //M�todo static para acessar instancia que contem o objeto.
		if(impressora == null) {
			impressora = new Impressora();
		}
		
		return impressora;
	}
}
