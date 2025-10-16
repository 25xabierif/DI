import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ex7 extends JFrame{

    /* Campo de contraseña (JPasswordField). Crea una interfaz con un campo de texto para
el nombre de usuario y un campo de contraseña. Al hacer clic en el botón "Iniciar se-
sión", muestra en la consola el nombre de usuario y la contraseña ingresada (la contra-
seña puede ser simplemente leída como texto). */

    JFrame window;

    public Ex7(String nombre){
        this.window = new JFrame(nombre);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));

        JLabel usuario = new JLabel("Nombre de usuario: ");
        JTextField user = new JTextField();
        JLabel passw = new JLabel("Contraseña");
        JPasswordField pass = new JPasswordField();

        JButton boton = new JButton("Iniciar sesión");
        boton.addActionListener((ActionEvent e)->{
            String contrasinal = "";
            for (char c : pass.getPassword()) {
                contrasinal+=c;
            }
            System.out.println("Usuario: "+user.getText()+"\nPassword: "+contrasinal);
        });


        window.add(usuario);
        window.add(user);
        window.add(passw);
        window.add(pass);
        window.add(boton);
        window.setVisible(true);
    }

}
