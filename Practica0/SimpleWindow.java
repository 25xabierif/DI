import java.awt.Window;
import javax.swing.*;

public class SimpleWindow{
    public static void main(String[] args) {
        //1 Creamos a ventá e asignamos un título
        JFrame firstWindow = new JFrame("Practica 0");

        //Configuramos tamaño
        firstWindow.setSize(400,300);

        //3 Ocultamos os botóns de minimizar e maximizar
        firstWindow.setType(Window.Type.UTILITY);

        //4 Permitimos cambiar o tamaño da ventá
        firstWindow.setResizable(true);

        //Mostramos a ventá
        firstWindow.setVisible(true);
    }
}
