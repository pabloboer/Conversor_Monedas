package MVC.modelo;

public class Validaciones{

	public boolean esNumero(String entrada) {
	    if (entrada == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(entrada);	        
	    } catch (NumberFormatException nfe) {
	    	//nfe.printStackTrace();
	        return false;
	    }
	    return true;
	}
	
}