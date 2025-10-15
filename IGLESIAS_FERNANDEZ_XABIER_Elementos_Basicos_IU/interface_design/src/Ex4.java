import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex4 extends JFrame{
    
/* Uso de etiquetas y campos de texto. Crea una interfaz que tenga dos campos de texto:
uno para el nombre y otro para el apellido. Al hacer clic en un botón "Enviar", debe
mostrar un saludo personalizado en la consola con el nombre completo. */
    JFrame window;

    public Ex4(String nombre){
        this.window = new JFrame(nombre);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);

        JTextField name = new JTextField("Introduce tu nombre: ");
        JTextField surname = new JTextField("Introduce tu apellido: ");

        JButton boton = new JButton("Pulse aquí");
        boton.addActionListener((ActionEvent e) -> {
            String nombreCompleto = name.getText().concat(" "+surname.getText());
            System.out.println("Hola "+nombreCompleto+"!!!");
        });

        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));

        name.setAlignmentY(TOP_ALIGNMENT);
        window.add(name);

        surname.setAlignmentY(CENTER_ALIGNMENT);
        window.add(surname);

        boton.setAlignmentY(BOTTOM_ALIGNMENT);
        window.add(boton);

        window.setVisible(true);
    }

}
