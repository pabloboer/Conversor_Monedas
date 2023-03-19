package Standard;

import java.util.*;
import java.lang.*;

public class Conversor{
	
	
	public Conversor(){

	}


	public double getTasaConversion(String tipoConversion){

		//Pesos Argentinos a Dólar
		if (tipoConversion == Opciones.opcionesConvertirMonedas[0]) {
			return 1/375.00;
			
		//Pesos Argentinos a Euros
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[1]) {
			return 1/401.00;
			
		//Pesos Argentinos a Libras Esterlinas
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[2]) {
			return 1/245.00;
			
		//Pesos Argentinos a Yen Japonés
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[3]) {
			return 1/1.53;
			
		//Pesos Argentinos a Won sul-coreano
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[4]) {
			return 1/0.15;
			
		//Dólar a Pesos Argentinos
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[5]) {
			return 375;
			
		//Euros a Pesos Argentinos
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[6]) {			
			return 401;
			
		//Libras Esterlinas a Pesos Argentinos
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[7]) {
			return 245;
			
		//Yen Japonés a Pesos Argentinos
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[8]) {			
			return 1.53;
			
		//Won sul-coreano a Pesos Argentinos
		}else if (tipoConversion == Opciones.opcionesConvertirMonedas[9]) {
			return 0.15;
		}
		//Centrimetros a Pulgadas
		if (tipoConversion == Opciones.opcionesConvertirMetrico[0]) {
			return 1/2.45;
			
		//Kilometros a Millas
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[1]) {
			return 0.62;
			
		//Hectáreas a Acres
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[2]) {
			return 2.47;
			
		//Litros a Galones (US)
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[3]) {
			return 3.78;
			
		//Gramos a Onzas
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[4]) {
			return 1/28.35;
			
		//Kilogramos a Libras
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[5]) {
			return 2.2;
			
		//Pulgadas a Centimetros
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[6]) {			
			return 2.54;
			
		//Millas Kilometros
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[7]) {
			return 1.61;
			
		//Acres a Hectáreas
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[8]) {			
			return 1.53;
			
		//Galones (US) a Litros
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[9]) {
			return 1/3.78;
			
		//Onzas a Gramos
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[10]) {
			return 28.35;

		//Libras a Kilogramos
		}else if (tipoConversion == Opciones.opcionesConvertirMetrico[11]) {
			return 1/2.2;
		}
		return 0;
}

	public double convertirDato(String tipoConversion, String entrada){

		try{
			double d = toDouble(entrada);
			double tasa = getTasaConversion(tipoConversion);
			
			return (d*tasa);

		}catch (NumberFormatException | NullPointerException np) {
			return 0;
		}		
	}
	
	public double toDouble(String str) {		
		return Double.parseDouble(str);
	}

	public String toString(double d) {		
		return String.valueOf((double)Math.round(d*100d)/100);
	}
/*
*	
*	public void PesosADolares(double pesos) {
*		double dolar = pesos / 375;
*		dolar = (double)Math.round(dolar*100d)/100;
*		JOptionPane.showMessageDialog(null, "Tienes USD " + dolar + "Dólares Estadounidenses");
*	}
*/
	
}