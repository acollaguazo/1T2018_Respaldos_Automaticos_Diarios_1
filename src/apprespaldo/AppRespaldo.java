package apprespaldo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase AppRespaldo
 * Muestra la estructuta que deberia tener una Ventana en Java con la libreria
 * Swing, instancia la ventana Principal.
 * @author grupo1
 * @version  1.0
 */
public class AppRespaldo extends JFrame implements ActionListener {

    private Principal inicio;           // etiqueta o texto no editable

    public AppRespaldo() {
        super();                        // usamos el contructor de la clase padre JFrame
        this.inicializarComponentes();  // inicializamos los atributos o componentes
    }

    private void inicializarComponentes() {
        // creamos los componentes
        inicio= new  Principal();
    }



    public static void main(String[] args) {
                new AppRespaldo().inicio.setVisible(true); // creamos una ventana y hacemos visible la ventana creada
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}