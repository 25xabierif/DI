import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ex8 extends JFrame{

    /* Radio Buttons (JRadioButton). Crea una interfaz con un grupo de tres botones de op-
ción (radio buttons) que representen opciones de pago: "Tarjeta de Crédito", "PayPal",
y "Transferencia Bancaria". Al seleccionar una opción y hacer clic en un botón de "Con-
firmar", muestra en la consola la opción seleccionada. */

    JFrame window;

    public Ex8(String nombre){

        this.window = new JFrame(nombre);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JRadioButton creditC = new JRadioButton("Tarjeta de credito");

        JRadioButton payPal = new JRadioButton("PayPal");

        JRadioButton transf = new JRadioButton("Transferencia bancaria");

        


        window.setVisible(true);
    }

}
