import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex6 extends JFrame{

    /* Menú desplegable (JComboBox). Crea una interfaz que tenga un menú desplegable con
opciones para elegir un color (por ejemplo: "Rojo", "Verde", "Azul"). Al seleccionar un
color, muestra el color seleccionado en la consola. */

    JFrame window;

    public Ex6(String nombre){
        this.window = new JFrame(nombre);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setLayout(new FlowLayout());

        String[] colores = {"Rojo","Azul","Verde"};
        JComboBox<String> combo = new JComboBox<>(colores);

        combo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String colorSelec = (String) combo.getSelectedItem();
                System.out.println("Has elegido el: "+colorSelec);
            }
            
        });

        window.add(combo);
        window.setVisible(true);
    }
}
