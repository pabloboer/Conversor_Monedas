package MVC.modelo;


public class Unidades{

	private String id;
	private String simbolo;
	private String nombre;
	private Opciones opciones;
	

	public Unidades(String unidad){
		opciones = new Opciones();
		//Pesos Argentinos a Dólar
		if (unidad == opciones.opcionesConvertirMonedas[0]) {	
			setId("US");
			setSimbolo("USD");
			setNombre("Dolares Estadounidenses");
		
		//Pesos Argentinos a Euros
		}else if (unidad == opciones.opcionesConvertirMonedas[1]) {
			setId("EUR");
			setSimbolo("€");
			setNombre("Euros");
			
		//Pesos Argentinos a Libras Esterlinas
		}else if (unidad == opciones.opcionesConvertirMonedas[2]) {
			setId("GBP");
			setSimbolo("£");
			setNombre("Libras Esterlinas");
			
		//Pesos Argentinos a Yen Japonés
		}else if (unidad == opciones.opcionesConvertirMonedas[3]) {
			setId("JPY");
			setSimbolo("¥");
			setNombre("Yen Japonés");
			
		//Pesos Argentinos a Won sul-coreano
		}else if (unidad == opciones.opcionesConvertirMonedas[4]) {
			setId("KRW");
			setSimbolo("₩");
			setNombre("Won Sul-Coreano");
			
		//Dólar a Pesos Argentinos
		}else {
			setId("AR");
			setSimbolo("$");
			setNombre("Pesos Argentinos");
			
		//Euros a Pesos Argentinos
		}
		
		//Centrimetros a Pulgadas
		if (unidad == opciones.opcionesConvertirMetrico[0]) {
			setId("IN");
			setSimbolo("");
			setNombre("Pulgadas");
			
		//Kilometros a Millas
		}else if (unidad == opciones.opcionesConvertirMetrico[1]) {
			setId("MIL");
			setSimbolo("");
			setNombre("Millas");
			
		//Hectáreas a Acres
		}else if (unidad == opciones.opcionesConvertirMetrico[2]) {
			setId("AC");
			setSimbolo("");
			setNombre("Acres");
			
		//Litros a Galones (US)
		}else if (unidad == opciones.opcionesConvertirMetrico[3]) {
			setId("GAL_US");
			setSimbolo("");
			setNombre("US Galones");
			
		//Gramos a Onzas
		}else if (unidad == opciones.opcionesConvertirMetrico[4]) {
			setId("OZ");
			setSimbolo("");
			setNombre("Onzas");
			
		//Kilogramos a Libras
		}else if (unidad == opciones.opcionesConvertirMetrico[5]) {
			setId("LB");
			setSimbolo("");
			setNombre("Libras");
			
		//Pulgadas a Centimetros
		}else if (unidad == opciones.opcionesConvertirMetrico[6]) {			
			setId("CM");
			setSimbolo("");
			setNombre("Centímetros");
			
		//Millas Kilometros
		}else if (unidad == opciones.opcionesConvertirMetrico[7]) {
			setId("KM");
			setSimbolo("");
			setNombre("Kilómetros");
			
		//Acres a Hectáreas
		}else if (unidad == opciones.opcionesConvertirMetrico[8]) {			
			setId("HA");
			setSimbolo("");
			setNombre("Hectáreas");
			
		//Galones (US) a Litros
		}else if (unidad == opciones.opcionesConvertirMetrico[9]) {
			setId("LTS");
			setSimbolo("");
			setNombre("Litros");
			
		//Onzas a Gramos
		}else if (unidad == opciones.opcionesConvertirMetrico[10]) {
			setId("GR");
			setSimbolo("");
			setNombre("Gramos");

		//Libras a Kilogramos
		}else if (unidad == opciones.opcionesConvertirMetrico[11]) {
			setId("KG");
			setSimbolo("");
			setNombre("Kilogramos");
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {

		this.id = id;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}