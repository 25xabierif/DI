import javax.swing.*;

public class Ex10 extends JFrame{
    
    /* Menú de barra (JMenuBar y JMenu). Crea una interfaz que tenga un menú en la barra
superior con dos opciones: "Archivo" y "Edición". En "Archivo", agrega un submenú
"Abrir" y "Guardar". Al seleccionar una de estas opciones, muestra el texto correspon-
diente en la consola. */

    private JFrame window;

    public Ex10(String titulo){

        window = new JFrame(titulo);
        window.setSize(400,300);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        JMenuBar menu = new JMenuBar();


        window.setJMenuBar(menu);
        window.setVisible(true);

    }
}
