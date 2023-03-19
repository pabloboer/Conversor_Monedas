package MVC.controlador;

import MVC.modelo.*;
import MVC.vista.*;
import javax.swing.*;

public class Controlador {
	
	public static void main(String[] args) {
		
		boolean continuar = false;
		final int ERROR_MENSAJE = JOptionPane.ERROR_MESSAGE;
		final int MENSAJE_INFORMACION= JOptionPane.INFORMATION_MESSAGE;
		final int MENSAJE_CONFIRMACION= JOptionPane.QUESTION_MESSAGE;
		
		Opciones opciones = new Opciones();
		String opcionConversion;
		String textoIngresado;
		Validaciones validacion = new Validaciones();
		
		do {
			try{
			String titulo = "Menu Principal";
			String mensaje = "Seleccione una opción de conversión";
			Ventana menuPrincipal = new Ventana(titulo, mensaje, opciones.opcionesConversor);
			String tipoConversion = menuPrincipal.getOpcionElegida();
					
				if (tipoConversion == opciones.opcionesConversor[0]) { 
					Ventana menuOpciones = new Ventana(titulo, mensaje, opciones.opcionesConvertirMonedas);
					opcionConversion= menuOpciones.getOpcionElegida();
				}
				else {
					Ventana menuOpciones = new Ventana(titulo, mensaje, opciones.opcionesConvertirMetrico);
					opcionConversion= menuOpciones.getOpcionElegida();
				}
				
				titulo = "Conversion - " + opcionConversion;
				mensaje = "Ingrese la cantidad que deseas convertir:";
				
				Ventana menuInput = new Ventana(titulo,mensaje);
				textoIngresado = menuInput.getTextoIngresado();

				while(!validacion.esNumero(textoIngresado)) {
					
					Ventana msgError = new Ventana(titulo, "Ingrese solamente números",ERROR_MENSAJE);
					
					menuInput = new Ventana(titulo,mensaje);	
					textoIngresado = menuInput.getTextoIngresado();										
				}			
				
				Unidades unidadSalida = new Unidades(opcionConversion);
				Conversor conversor = new Conversor(opcionConversion);
				
				conversor.convertir(opcionConversion,unidadSalida,textoIngresado);
				
				Ventana msgSalida = new Ventana(titulo, conversor.formateo(textoIngresado) +" "+ opcionConversion +" "+ conversor.getSalidaTxt(),MENSAJE_INFORMACION);
				
				titulo = "Confirmación";
				mensaje = "¿Desea continuar?";
				Ventana ventanaContinuar = new Ventana(titulo, mensaje, MENSAJE_CONFIRMACION);			
				
				if (ventanaContinuar.getBotonElegido() == JOptionPane.OK_OPTION) {
					continuar= true;
				}
				else {
					continuar = false;
				}

			}
			catch(NullPointerException np) {
				String titulo = "Confirmación";				
				String mensaje = "¿Desea Salir?";

				Ventana ventanaContinuar = new Ventana(titulo, mensaje, MENSAJE_CONFIRMACION);			
				
				if (ventanaContinuar.getBotonElegido() == JOptionPane.OK_OPTION) {
					continuar= false;
				}
				else {
					continuar = true;
				}
			}
		} while (continuar);
		
		Ventana msgFin = new Ventana("Programa terminado", "Fin", MENSAJE_INFORMACION);
	}
	
}