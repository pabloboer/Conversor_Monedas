package MVC.modelo;

import java.text.NumberFormat;
import java.util.Locale;

public class Conversor{
	
	private Opciones opciones;
	private Unidades unidadSalida;
	private String salidaTxt;
	private final double TASA_PESO_DOLAR = 1/203.28;
	private final double TASA_PESO_EURO = 1/218.35;
	private final double TASA_PESO_GBP = 1/247.61;
	private final double TASA_PESO_YEN = 1/1.54;
	private final double TASA_PESO_WON= 1/0.155;
	
	private final double TASA_CM_IN= 1/2.54;
	private final double TASA_KM_MIL= 1/1.61;
	private final double TASA_HA_ACRES= 2.47;
	private final double TASA_L_GAL= 1/3.785;
	private final double TASA_GR_OZ= 1/28.35;
	private final double TASA_KG_LB= 2.20462;
	
	
	
	public Conversor(String tipoConversion){
		this.opciones = new Opciones();
		this.unidadSalida = new Unidades(tipoConversion);
	}
	
	public double convertir(String tipoConversion, Unidades unidad, String dato){

		double d = toDouble(dato);
		
		
		//Pesos Argentinos a Dólar
		if (tipoConversion == opciones.opcionesConvertirMonedas[0]) {
			return calculo(d,TASA_PESO_DOLAR);
			
		//Pesos Argentinos a Euros
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[1]) {
			return calculo(d,TASA_PESO_EURO);
			
		//Pesos Argentinos a Libras Esterlinas
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[2]) {
			return calculo(d,TASA_PESO_GBP);
			
		//Pesos Argentinos a Yen Japonés
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[3]) {
			return calculo(d,TASA_PESO_YEN);
			
		//Pesos Argentinos a Won sul-coreano
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[4]) {
			return calculo(d,TASA_PESO_WON);
			
		//Dólar a Pesos Argentinos
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[5]) {
			return calculo(d,1/TASA_PESO_DOLAR);
			
		//Euros a Pesos Argentinos
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[6]) {			
			return calculo(d,1/TASA_PESO_EURO);
			
		//Libras Esterlinas a Pesos Argentinos
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[7]) {
			return calculo(d,1/TASA_PESO_GBP);
			
		//Yen Japonés a Pesos Argentinos
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[8]) {			
			return calculo(d,1/TASA_PESO_YEN);
			
		//Won sul-coreano a Pesos Argentinos
		}else if (tipoConversion == opciones.opcionesConvertirMonedas[9]) {
			return calculo(d,1/TASA_PESO_WON);
		}
		//Centrimetros a Pulgadas
		if (tipoConversion == opciones.opcionesConvertirMetrico[0]) {
			return calculo(d,TASA_CM_IN);
			
		//Kilometros a Millas
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[1]) {
			return calculo(d,TASA_KM_MIL);
			
		//Hectáreas a Acres
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[2]) {
			return calculo(d,TASA_HA_ACRES);
			
		//Litros a Galones (US)
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[3]) {
			return calculo(d,TASA_L_GAL);
			
		//Gramos a Onzas
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[4]) {
			return calculo(d,TASA_GR_OZ);
			
		//Kilogramos a Libras
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[5]) {
			return calculo(d,TASA_KG_LB);
			
		//Pulgadas a Centimetros
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[6]) {			
			return calculo(d,1/TASA_CM_IN);
			
		//Millas Kilometros
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[7]) {
			return calculo(d,1/TASA_KM_MIL);
			
		//Acres a Hectáreas
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[8]) {			
			return calculo(d,1/TASA_HA_ACRES);
			
		//Galones (US) a Litros
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[9]) {
			return calculo(d,1/TASA_L_GAL);
			
		//Onzas a Gramos
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[10]) {
			return calculo(d,1/TASA_GR_OZ);

		//Libras a Kilogramos
		}else if (tipoConversion == opciones.opcionesConvertirMetrico[11]) {
			return calculo(d,1/TASA_KG_LB);
		}
		return 0;

	}

	public double toDouble (String entrada){
		
		try{
			double d = Double.parseDouble(entrada);						
			return (d);

		}catch (NumberFormatException | NullPointerException np) {
			return 0;
		}	

	}

	public double formateo(double d) {
		return ((double)Math.round((d)*100d)/100);
	}
	
	public String formateo(String d) {
		
		Locale argentina = new Locale ("es", "AR");
				
		return (NumberFormat.getInstance(argentina).format((double)Math.round((toDouble(d))*100d)/100));
	}

	public String toString(double monto){

		Locale argentina = new Locale ("es", "AR");
		
		
		return ("son " + this.unidadSalida.getSimbolo()+ " " + NumberFormat.getInstance(argentina).format(monto) + " " + this.unidadSalida.getNombre());
	}
	

	public double calculo(double entrada, double tasa) {
		double salida = entrada * tasa;
		double salidaFormateada = formateo(salida);
		this.setSalidaTxt(this.toString(salidaFormateada));
		
		return (salida);
	}

	
	public String getSalidaTxt() {
		return salidaTxt;
	}

	public void setSalidaTxt(String salidaTxt) {
		this.salidaTxt = salidaTxt;
	}

	public String getUnidadSalida() {
		return this.unidadSalida.getSimbolo();
	}



	

}