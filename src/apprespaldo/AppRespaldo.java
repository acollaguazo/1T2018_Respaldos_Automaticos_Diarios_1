package apprespaldo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
 * Clase AppRespaldo
 * Muestra la estructuta que deberia tener una Ventana en Java con la libreria
 * Swing, instancia la ventana Principal.
 * @author Luis Macas, Christin Ochoa, Martin Herrera
<<<<<<< HEAD
 * @version:17/7/2018
=======
 * @version:14/8/2018
>>>>>>> ce0a7f8cdd207ddd697df2e58fcddc970d913d83
 */
public class AppRespaldo extends JFrame implements ActionListener {
    //Campos de la clase
    private Principal inicio;
<<<<<<< HEAD
    public int diaInicioSist;
    public int mesInicioSist;
    public int anioInicioSist;
=======
>>>>>>> ce0a7f8cdd207ddd697df2e58fcddc970d913d83
    /*
     * Contructor de la clase padre JFrame
     * posee un metodo el cual inicializa los atributos o componentes
     */
    public AppRespaldo() {
        super(); this.inicializarComponentes();
    } //cierre del constructor
    /*
     * Metodo que inicializa la clase Principal
     * guardada en el atributo inicio
     */
    private void inicializarComponentes() {
        inicio = new  Principal();
    } //cierre del  metodo
    /*
     * Creamos una ventana y hacemos visible la ventana creada
    */
    public static void main(String[] args) {
        new AppRespaldo().inicio.setVisible(true);
    } //cierre del  metodo
    /*
     * metodo que crea una UnsupportedOperationException
    * cuando la operación solicitada no es compatible.
    * @param ae el parametro atrapa la excepcion
    */
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}