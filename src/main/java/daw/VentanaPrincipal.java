/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class VentanaPrincipal extends JFrame{
    
    public static final int ANCHO_FRAME = 600;
    public static final int ALTO_FRAME = 200;
    
     private Panel panel;
     
     public VentanaPrincipal(){
        crearVentana();
        // Incializa el atributo de tipo Panel
        panel = new Panel();
        // Añade el panel a la ventana
        this.add(panel);
        // Cuando todos los elementos están creados se hace visible la ventana
        this.setVisible(true);
    }
     
     private void crearVentana(){
        // Posición y tamaño del JFrame
        this.setBounds(600, 150, ANCHO_FRAME, ALTO_FRAME);
        // Título de la ventana
        this.setTitle("Generador de códigos QR");
        // Ventana no redimensionable
        this.setResizable(false);
        // Comportamiento al cerrar la ventana
        // Terminar el programa
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
    
}
