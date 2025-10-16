import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Interfaz extends JFrame{
    
    JFrame textProcessor;

    public Interfaz(){
        textProcessor = new JFrame("Caderno de Xabier");
        textProcessor.setSize(700,500);
        textProcessor.setLocationRelativeTo(null);
        textProcessor.setDefaultCloseOperation(EXIT_ON_CLOSE);

        textProcessor.setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        JScrollPane barra = new JScrollPane(areaTexto);


        JMenuBar menu = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");

        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");

        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(salir);

        menu.add(archivo);
        menu.add(edicion);

        textProcessor.getContentPane().add(barra, BorderLayout.CENTER);
        textProcessor.setJMenuBar(menu);
        textProcessor.setVisible(true);
    }

}
