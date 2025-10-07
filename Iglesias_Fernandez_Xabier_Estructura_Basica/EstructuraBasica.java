import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.BorderLayout;

public class EstructuraBasica extends JFrame{
    public static void main(String[] args) {
        
        JFrame window = new JFrame("Estructura básica");
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Layout en el contenedor principal
        window.setLayout(new BorderLayout(10,10));

        // Creamos los paneles para cada zona
        Color colorZonas = new Color(210, 80, 80);
        Color colorMedio = new Color(100,200,50);

        //Creamos los JPanel que contendrá el JFrame
        JPanel mainHeader = new JPanel();
        mainHeader.setBackground(colorZonas);
        mainHeader.setLayout(new GridBagLayout());
        JLabel mainHeaderLabel = new JLabel("<header>");
        mainHeaderLabel.setVerticalAlignment(SwingConstants.CENTER);
        mainHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainHeader.add(mainHeaderLabel);

        JPanel mainFooter = new JPanel();
        mainFooter.setBackground(colorZonas);
        mainFooter.setLayout(new GridBagLayout());
        JLabel mainFooterLabel = new JLabel("<footer>");
        mainFooterLabel.setVerticalAlignment(SwingConstants.CENTER);
        mainFooterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainFooter.add(mainFooterLabel);

        JPanel nav = new JPanel();
        nav.setBackground(colorZonas);
        nav.setLayout(new GridBagLayout());
        JLabel navLabel = new JLabel("<nav>");
        navLabel.setVerticalAlignment(SwingConstants.CENTER);
        navLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nav.add(navLabel);

        JPanel aside = new JPanel();
        aside.setBackground(colorZonas);
        aside.setLayout(new GridBagLayout());
        JLabel asideLabel = new JLabel("<aside>");
        asideLabel.setVerticalAlignment(SwingConstants.CENTER);
        asideLabel.setHorizontalAlignment(SwingConstants.CENTER);
        aside.add(asideLabel);

        JPanel section = new JPanel();
        section.setBackground(colorZonas);

        JLabel sectionLabel = new JLabel("<section>");
        sectionLabel.setHorizontalAlignment(JLabel.CENTER);

        section.setLayout(new BorderLayout(10,10));

        //Creamos panel central
        JPanel centerContent = new JPanel();
        centerContent.setBackground(colorZonas);
        centerContent.setLayout(new BorderLayout(10,10));
        centerContent.setBorder(BorderFactory.createEmptyBorder(30, 50, 65, 50));

        JPanel header = new JPanel();
        header.setBackground(colorMedio);
        header.setLayout(new GridBagLayout());
        JLabel headerLabel = new JLabel("<header>");
        headerLabel.setVerticalAlignment(SwingConstants.CENTER);
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        header.add(headerLabel);

        JPanel article = new JPanel();
        article.setBackground(colorMedio);
        article.setLayout(new GridBagLayout());
        JLabel articleLabel = new JLabel("<article>");
        articleLabel.setVerticalAlignment(SwingConstants.CENTER);
        articleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        article.add(articleLabel);

        JPanel footer = new JPanel();
        footer.setBackground(colorMedio);
        footer.setLayout(new GridBagLayout());
        JLabel footerLabel = new JLabel("<footer>");
        footerLabel.setVerticalAlignment(SwingConstants.CENTER);
        footerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        footer.add(footerLabel);

        section.add(sectionLabel, BorderLayout.NORTH);
        section.add(centerContent, BorderLayout.CENTER);

        centerContent.add(header, BorderLayout.NORTH);
        centerContent.add(article, BorderLayout.CENTER);
        centerContent.add(footer, BorderLayout.SOUTH);


        window.add(mainHeader, BorderLayout.NORTH);
        window.add(mainFooter, BorderLayout.SOUTH);
        window.add(nav, BorderLayout.WEST);
        window.add(aside, BorderLayout.EAST);
        window.add(section, BorderLayout.CENTER);
        window.setVisible(true);
    }
}
