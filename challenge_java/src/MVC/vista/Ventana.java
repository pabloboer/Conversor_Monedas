package MVC.vista;

import javax.swing.*;

public class Ventana {

	//private String tituloVentana;
	//private String mensajeEntrada;	
	private String opcionElegida;
	private String textoIngresado;
	private int botonElegido;
		
	//Constructor de Ventana con Combobox
	public Ventana(String titulo, String mensaje, String [] opciones){
		this.opcionElegida = JOptionPane.showInputDialog(null,mensaje,titulo,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]).toString();
	}

	public Ventana(String titulo, String mensaje, String tipoConversion, String [] opciones, String [] opciones2){
		
		this.opcionElegida = JOptionPane.showInputDialog(null,titulo,mensaje,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]).toString();
	}
	
	//Constructor de Ventana con InputDialog
	public Ventana(String titulo, String mensaje){
		this.textoIngresado = JOptionPane.showInputDialog(null,mensaje,titulo,JOptionPane.QUESTION_MESSAGE).toString();
	}
	
	//Constructor de Ventana Mensajes
	public Ventana(String titulo, String mensaje, int tipo){
		
		if (tipo == JOptionPane.ERROR_MESSAGE) {
			JOptionPane.showMessageDialog(null,mensaje, titulo, JOptionPane.ERROR_MESSAGE,null);
		}
		else if (tipo == JOptionPane.INFORMATION_MESSAGE) {
			JOptionPane.showMessageDialog(null,mensaje, titulo, JOptionPane.INFORMATION_MESSAGE,null);
		}
		else if (tipo == JOptionPane.QUESTION_MESSAGE) {
			setBotonElegido(JOptionPane.showConfirmDialog(null,mensaje, titulo, JOptionPane.YES_NO_CANCEL_OPTION));
		}
	}
		
	public String getOpcionElegida(){
		
		return this.opcionElegida;
	}
	
	public String getTextoIngresado(){
		return this.textoIngresado;
	}
	public void getMensajeMostrar(String mensajeMostrar){
		JOptionPane.showMessageDialog(null, mensajeMostrar);
	}

	public int getBotonElegido() {
		return botonElegido;
	}

	public void setBotonElegido(int botonElegido) {
		this.botonElegido = botonElegido;
	}	


}