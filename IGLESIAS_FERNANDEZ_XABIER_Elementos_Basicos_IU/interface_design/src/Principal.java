import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame{
    public static void main(String[] args){

        JFrame window = new JFrame("Menú");
        window.setSize(700,200);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setLayout(new GridLayout());
        

        JButton boton1 = new JButton("Ex1");
        boton1.addActionListener(e->{
            new Ex1("Exercicio1");
        });
        JButton boton2 = new JButton("Ex2");
        boton2.addActionListener(e->{
            new Ex2("Exercicio2");
        });
        JButton boton3 = new JButton("Ex3");
        boton3.addActionListener(e->{
            new Ex3("Exercicio3");
        });
        JButton boton4 = new JButton("Ex4");
        boton4.addActionListener(e->{
            new Ex4("Exercicio4");
        });
        JButton boton5 = new JButton("Ex5");
        boton5.addActionListener(e->{
            new Ex5("Exercicio5");
        });
        JButton boton6 = new JButton("Ex6");
        boton6.addActionListener(e->{
            new Ex6("Exercicio6");
        });
        JButton boton7 = new JButton("Ex7");
        boton7.addActionListener(e->{
            new Ex7("Exercicio7");
        });
        JButton boton8 = new JButton("Ex8");
        boton8.addActionListener(e->{
            new Ex8("Exercicio8");
        });
        JButton boton9 = new JButton("Ex9");
        boton9.addActionListener(e->{
            new Ex9("Exercicio9");
        });
        JButton boton10 = new JButton("Ex10");
        boton10.addActionListener(e->{
            new Ex10("Exercicio10");
        });

        window.add(boton1);
        window.add(boton2);
        window.add(boton3);
        window.add(boton4);
        window.add(boton5);
        window.add(boton6);
        window.add(boton7);
        window.add(boton8);
        window.add(boton9);
        window.add(boton10);
        window.setVisible(true);
    }
}
