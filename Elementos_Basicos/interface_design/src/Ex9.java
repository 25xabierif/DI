import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Ex9 extends JFrame{
    /* Checkbox (JCheckBox). Crea una interfaz con tres casillas de verificación (checkboxes)
que representen opciones de toppings para una pizza: "Queso Extra", "Pepperoni", y
"Aceitunas". Al hacer clic en el botón "Ordenar", muestra en la consola los toppings se-
leccionados */

    private JFrame window;

    public Ex9(String titulo){
        this.window = new JFrame(titulo);
        window.setSize(200,200);
        window.setLocationRelativeTo(null);
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));

        final JCheckBox queso = new JCheckBox("Queso Extra");
        final JCheckBox pepperoni = new JCheckBox("Pepperoni");
        final JCheckBox aceituna = new JCheckBox("Aceitunas");

        queso.setAlignmentX(Component.CENTER_ALIGNMENT);
        pepperoni.setAlignmentX(Component.CENTER_ALIGNMENT);
        aceituna.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton boton = new JButton("Ordenar");
        boton.addActionListener((ActionEvent e)->{
            System.out.println("Toppings seleccionados: ");
            if(queso.isSelected()){
                System.out.println(queso.getText());
            }
            if(pepperoni.isSelected()){
                System.out.println(pepperoni.getText());
            }
            if(aceituna.isSelected()){
                System.out.println(aceituna.getText());
            }
            if(!queso.isSelected() && !pepperoni.isSelected() && !aceituna.isSelected()){
                System.out.println("No ha elegido ningún topping");
            }
        });

        boton.setAlignmentX(Component.CENTER_ALIGNMENT);

        window.add(queso);
        window.add(pepperoni);
        window.add(aceituna);
        window.add(boton);
        window.setVisible(true);

    }
}
