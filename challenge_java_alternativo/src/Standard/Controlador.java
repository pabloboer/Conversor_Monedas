package Standard;

import javax.swing.*;

public class Controlador {
	
	public static void main(String[] args) {
		
		boolean continuar = false;
		final int ERROR_MENSAJE = 0;
		final int MENSAJE_RESPUESTA= 1;
		String opcionConversion;
		String textoIngresado;
		Validaciones validacion = new Validaciones();
		
		String titulo = "Menu Principal";
		String mensaje = "Seleccione una opción de conversión";
		
		do {
			try{
				String tipoConversion = JOptionPane.showInputDialog(null,titulo,mensaje,JOptionPane.QUESTION_MESSAGE,null,Opciones.opcionesConversor,Opciones.opcionesConversor[0]).toString();
					
				if (tipoConversion == Opciones.opcionesConversor[0]) { 
					opcionConversion=JOptionPane.showInputDialog(null,titulo,mensaje,JOptionPane.QUESTION_MESSAGE,null,Opciones.opcionesConvertirMonedas,Opciones.opcionesConvertirMonedas[0]).toString();
				}
				else {
					opcionConversion=JOptionPane.showInputDialog(null,titulo,mensaje,JOptionPane.QUESTION_MESSAGE,null,Opciones.opcionesConvertirMetrico,Opciones.opcionesConvertirMetrico[0]).toString();
					
				}
				titulo = "Conversion - " + opcionConversion;
				mensaje = "Ingrese la cantidad que deseas convertir:";
				textoIngresado = JOptionPane.showInputDialog(null,mensaje,titulo,JOptionPane.QUESTION_MESSAGE);
			
				while(!validacion.esNumero(textoIngresado)) {
					
					JOptionPane.showMessageDialog(null,"Ingrese solamente números", titulo, ERROR_MENSAJE,null);
					textoIngresado = JOptionPane.showInputDialog(null,mensaje,titulo,JOptionPane.QUESTION_MESSAGE).toString();									
				}	
				Conversor conversor = new Conversor();
				String txtSalida = conversor.toString(conversor.convertirDato(opcionConversion,textoIngresado));
				
				//Setear numeros
				
				JOptionPane.showMessageDialog(null,textoIngresado +" "+ opcionConversion + " son " + txtSalida,titulo, MENSAJE_RESPUESTA);
				if (JOptionPane.showConfirmDialog(null, "Desea continuar")==JOptionPane.OK_OPTION) {
					continuar= true;
				}
				else {
					continuar = false;
				}
				
				
			}
			catch(NullPointerException np) {
				continuar = false;
			}
				
		} while (continuar);
		
		JOptionPane.showMessageDialog(null,"Programa terminado", "Fin", MENSAJE_RESPUESTA,null);
		
		
	}
	
}