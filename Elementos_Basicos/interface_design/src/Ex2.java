import java.awt.FlowLayout;
import javax.swing.*;


public class Ex2 {

/*Ventana con múltiples botones. Crea una ventana que tenga dos botones: uno que diga
"Aceptar" y otro que diga "Cancelar". Al hacer clic en el botón "Aceptar", se debe mostrar
el mensaje "Aceptado", y al hacer clic en "Cancelar", se debe mostrar "Cancelado". */

    private JFrame window;

    public Ex2 (String nombre){
        this.window = new JFrame(nombre);
        this.window.setSize(400,200);
        this.window.setLayout(new FlowLayout());
        this.window.setLocationRelativeTo(null);

        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(e->{
            JOptionPane.showMessageDialog(window, botonAceptar.getText(), botonAceptar.getText(), 0);
        });

        JButton botonCancelar = new JButton("Cancelar");
        botonCancelar.addActionListener(e->{
            JOptionPane.showMessageDialog(window, botonCancelar.getText(), botonCancelar.getText(), 0);
        });

        this.window.add(botonAceptar);
        this.window.add(botonCancelar);
        this.window.setVisible(true);
    }

}
