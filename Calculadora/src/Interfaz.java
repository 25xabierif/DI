import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {

    public Interfaz() {
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setSize(600, 350);
        calculadora.setLocationRelativeTo(null);
        calculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculadora.setLayout(new BorderLayout());

        // Panel superior para el display
        JTextField panel = new JTextField();
        panel.setEditable(false);
        panel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.setHorizontalAlignment(JTextField.LEFT);
        calculadora.add(panel, BorderLayout.NORTH);

        // Panel con botones (4x4)
        JPanel botones = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] textos = {
            "7", "8", "9", "÷",
            "4", "5", "6", "×",
            "1", "2", "3", "-",
            "0", ".", "C", "+"
        };

        for (String txt : textos) {
            JButton boton = new JButton(txt);
            if(txt == "C"){
                boton.setBackground(Color.RED);
            }
            boton.addActionListener(e->{
                if(txt == "C"){
                    panel.setText("");
                }else{
                    panel.setText(panel.getText()+txt);
                }
            });
            boton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    boton.setBackground(boton.getBackground().darker());
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    boton.setBackground(boton.getBackground().brighter());
            }
});

            botones.add(boton);
        }

        calculadora.add(botones, BorderLayout.CENTER);

        // Botón igual ocupa toda la parte inferior
        JButton igual = new JButton("=");
        igual.setBackground(Color.GREEN);
        igual.addActionListener(e->{
            try {
                String calculo = panel.getText().replace("×", "*").replace("÷", "/");

                Expression expr = new ExpressionBuilder(calculo).build();
                int result = (int) expr.evaluate();

                panel.setText(String.valueOf(result));

            } catch (Exception ex) {
                panel.setText("Error");
            }
        });
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    igual.setBackground(igual.getBackground().darker());
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    igual.setBackground(igual.getBackground().brighter());
            }
        });
        
        igual.setFont(new Font("Arial",Font.PLAIN, 24));
        calculadora.add(igual, BorderLayout.SOUTH);

        calculadora.setVisible(true);
    }
}

