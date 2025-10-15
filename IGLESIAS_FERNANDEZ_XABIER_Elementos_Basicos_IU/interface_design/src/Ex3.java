import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Ex3 extends JFrame{
    
/*Interfaz con campos de texto. Crea una ventana con un campo de texto donde el usuario pueda escribir
su nombre y un botón. Al hacer clic en el botón, debe mostrar en la
consola el nombre que el usuario ha introducido */

    private final JFrame window;
    String mensaje;

    public Ex3 (String nombre){
        window = new JFrame(nombre);
        window.setSize(800,600);

        JTextField campoTexto = new JTextField("Introduce tu nombre aquí...");
        window.setLocationRelativeTo(null);

        JButton boton = new JButton("Pulse aquí");
        boton.addActionListener((ActionEvent e) -> {
            String textoActual = campoTexto.getText();
            JOptionPane.showMessageDialog(window, textoActual);
        });
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
        campoTexto.setAlignmentY(TOP_ALIGNMENT);
        window.add(campoTexto);
        boton.setAlignmentY(CENTER_ALIGNMENT);
        window.add(boton);

        window.setVisible(true);
    }
}
