package Standard;

public class Validaciones{

	public boolean esNumero(String entrada) {
	    if (entrada == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(entrada);	        
	        
	    } catch (NumberFormatException nfe) {
	        return false;

	    }
	    return true;
	}
	
}