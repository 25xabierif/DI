
import java.awt.event.*;
import javax.swing.*;

public class Ex1 extends JFrame{

   /*  Crear una ventana básica. Crea una ventana con un botón que, al ser presionado, muestre un mensaje en la consola. */
   private JFrame window;
   private JButton boton;

   public Ex1 (String nombre){
      this.window = new JFrame(nombre);
      this.window.setSize(400,200);
      this.window.setLocationRelativeTo(null);
      this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.window.setVisible(true);
   }

   public void añadirBoton(String textoBoton){
      this.boton = new JButton(textoBoton);
      this.boton.addActionListener((ActionEvent e) -> {
         JOptionPane.showMessageDialog(this.window, "Has presionado el botón!");
      });
      this.window.add(this.boton);
      this.window.revalidate();
   }
}
