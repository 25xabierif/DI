import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class EstructuraBasica extends JFrame{
    public static void main(String[] args) {
        
        JFrame window = new JFrame("Estructura básica");
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Layout en el contenedor principal
        window.setLayout(new BorderLayout(10,10));

        // Creamos los paneles para cada zona
        JPanel header = new JPanel();
        header.setBackground(Color.RED);
        header.add(new JLabel("<header>"));

        JPanel footer = new JPanel();
        footer.setBackground(Color.RED);
        footer.add(new JLabel("<footer>"));

        JPanel nav = new JPanel();
        nav.setBackground(Color.RED);
        nav.add(new JLabel("<nav>"));

        JPanel aside = new JPanel();
        aside.setBackground(Color.RED);
        aside.add(new JLabel("<aside>"));

        JPanel section = new JPanel();
        section.setBackground(Color.RED);
        section.add(new JLabel("<section>"));


        
        window.add(header, BorderLayout.NORTH);
        window.add(footer, BorderLayout.SOUTH);
        window.add(nav, BorderLayout.WEST);
        window.add(aside, BorderLayout.EAST);
        window.add(section, BorderLayout.CENTER);
        window.setVisible(true);
    }
}
