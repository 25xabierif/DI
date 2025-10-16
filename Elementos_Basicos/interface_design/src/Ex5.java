import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex5 extends JFrame{
    /* Uso de cuadros de diálogo (JOptionPane). Crea una ventana con un botón que, al ser
presionado, muestre un cuadro de diálogo pidiendo al usuario que ingrese su edad.
Luego, debe mostrar otro cuadro de diálogo con la edad ingresada. */

    JFrame window;

    public Ex5(String nombre){
        this.window = new JFrame(nombre);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);

        JButton boton = new JButton("Boton");
        boton.addActionListener((ActionEvent e) -> {
            String edad = JOptionPane.showInputDialog(null, "Introduce tu edad", JOptionPane.QUESTION_MESSAGE);
            if(edad!=null){
                JOptionPane.showMessageDialog(boton, edad+" años!","Edad", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        window.add(boton);
        window.setVisible(true);
    }
}