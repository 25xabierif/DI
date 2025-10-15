
import javax.swing.*;

public class Ex1 extends JFrame{

   /*  Crear una ventana básica. Crea una ventana con un botón que, al ser presionado, muestre un mensaje en la consola. */
   private JFrame window;

   public Ex1 (String nombre){
      this.window = new JFrame(nombre);
      this.window.setSize(400,200);
      this.window.setLocationRelativeTo(null);

      JButton boton = new JButton("Boton");
      boton.addActionListener(e->{
         JOptionPane.showMessageDialog(window, "Has presionado el botón!");
      });

      this.window.add(boton);
      this.window.setVisible(true);
   }
}
