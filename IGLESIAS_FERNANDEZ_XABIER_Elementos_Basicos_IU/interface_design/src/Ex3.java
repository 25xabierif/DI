import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Ex3 extends JFrame{
    
/*Interfaz con campos de texto. Crea una ventana con un campo de texto donde el usuario pueda escribir
su nombre y un botón. Al hacer clic en el botón, debe mostrar en la
consola el nombre que el usuario ha introducido */

    private final JFrame window;
    private JButton boton;
    private JTextField campoTexto;
    String mensaje;

    public Ex3 (String nombre){
        this.window = new JFrame(nombre);
        this.window.setSize(400,200);
        this.window.setLayout(new FlowLayout());
        this.window.setLocationRelativeTo(null);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField campoTexto = new JTextField("Introduce tu nombre aquí...",20);

        this.window.add(campoTexto);

        this.window.setVisible(true);
    }

    

    public void añadirBoton(String textoBoton){
        this.mensaje = campoTexto.getText();
        this.boton = new JButton(textoBoton);
        this.boton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this.window, mensaje);
        });
        this.window.add(this.boton);
        this.window.revalidate();
    }
}
