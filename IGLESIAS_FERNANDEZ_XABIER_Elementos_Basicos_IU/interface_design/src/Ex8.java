import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ex8 extends JFrame{

    /* Radio Buttons (JRadioButton). Crea una interfaz con un grupo de tres botones de op-
ción (radio buttons) que representen opciones de pago: "Tarjeta de Crédito", "PayPal",
y "Transferencia Bancaria". Al seleccionar una opción y hacer clic en un botón de "Con-
firmar", muestra en la consola la opción seleccionada. */

    JFrame window;

    public Ex8(String nombre){

        this.window = new JFrame(nombre);
        window.setSize(200,150);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));

        ButtonGroup grupo = new ButtonGroup();
        
        final JRadioButton creditC = new JRadioButton("Tarjeta de credito");
        final JRadioButton payPal = new JRadioButton("PayPal");
        final JRadioButton transf = new JRadioButton("Transferencia bancaria");

        creditC.setSelected(true);
        
        creditC.setAlignmentX(Component.CENTER_ALIGNMENT);
        payPal.setAlignmentX(Component.CENTER_ALIGNMENT);
        transf.setAlignmentX(Component.CENTER_ALIGNMENT);


        grupo.add(creditC);
        grupo.add(payPal);
        grupo.add(transf);



        JButton boton = new JButton("Confirmar");
        boton.addActionListener((ActionEvent e)->{
            String opcion = "";
            if(creditC.isSelected()){
                opcion = creditC.getText();
            }else if(payPal.isSelected()){
                opcion = payPal.getText();
            }else if(transf.isSelected()){
                opcion = transf.getText();
            }

            JOptionPane.showMessageDialog(window, "Opción elegida: "+opcion, "Confirmación de pago",JOptionPane.INFORMATION_MESSAGE);

        });

        boton.setAlignmentX(Component.CENTER_ALIGNMENT);

        window.add(creditC);
        window.add(payPal);
        window.add(transf);
        window.add(boton);
        window.setVisible(true);
    }

}
