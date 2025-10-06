import javax.swing.*;
import java.awt.*;

public class Ex5 extends JFrame{

    public static void main(String[] args) {
        
        JFrame window = new JFrame("Ex5");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setLocationRelativeTo(null);

        //Instanciamos panel
        JPanel contenedor = new JPanel();
        contenedor.setSize(600,400);
        //Definimos o tipo de layout que vai ter o panel
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBackground(Color.DARK_GRAY);
        //Instanciamos gridbagconstraints para posicionar os elementos dentro do panel
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(5, 5, 5, 5);
        c.weightx = 1.0;
        c.weighty = 1.0;

        //Panel verdoso grid-column 1/4, grid-row 1/5
        JPanel verdoso = new JPanel();
        verdoso.setBackground(Color.CYAN);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 4;
        contenedor.add(verdoso, c);

        // ---- Verde ----
        JPanel verde = new JPanel();
        verde.setBackground(Color.GREEN);
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 2;
        contenedor.add(verde, c);

        // ---- Vermello ----
        JPanel vermello = new JPanel();
        vermello.setBackground(Color.RED);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        contenedor.add(vermello, c);

        // ---- Laranxa ----
        JPanel laranxa = new JPanel();
        laranxa.setBackground(Color.ORANGE);
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 3;
        contenedor.add(laranxa, c);

        // ---- Maxenta ----
        JPanel maxenta = new JPanel();
        maxenta.setBackground(Color.MAGENTA);
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 2;
        c.gridheight = 4;
        contenedor.add(maxenta, c);

        // ---- Azul ----
        JPanel azul = new JPanel();
        azul.setBackground(new Color(25, 25, 112));
        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth = 2;
        c.gridheight = 5;
        contenedor.add(azul, c);

        // ---- Beige ----
        JPanel beige = new JPanel();
        beige.setBackground(new Color(222, 184, 135));
        c.gridx = 3;
        c.gridy = 7;
        c.gridwidth = 2;
        c.gridheight = 1;
        contenedor.add(beige, c);

        window.add(contenedor);
        window.setVisible(true);

    }

}
