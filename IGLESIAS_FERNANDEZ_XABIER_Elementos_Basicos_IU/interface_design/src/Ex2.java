import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Ex2 {

/*Ventana con múltiples botones. Crea una ventana que tenga dos botones: uno que diga
"Aceptar" y otro que diga "Cancelar". Al hacer clic en el botón "Aceptar", se debe mostrar
el mensaje "Aceptado", y al hacer clic en "Cancelar", se debe mostrar "Cancelado". */

    private JFrame window;
    private JButton boton;

    public Ex2 (String nombre){
        this.window = new JFrame(nombre);
        this.window.setSize(400,200);
        this.window.setLayout(new FlowLayout());
        this.window.setLocationRelativeTo(null);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setVisible(true);
    }

    public void añadirBoton(String textoBoton, String mensaje){
        this.boton = new JButton(textoBoton);
        this.boton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this.window, mensaje);
        });
        this.window.add(this.boton);
        this.window.revalidate();
    }

}
