import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.*;

public class Interfaz extends JFrame{
    
    JFrame textProcessor;
    private boolean hayCambios = false;

    public Interfaz(){
        textProcessor = new JFrame("Caderno de Xabier");
        textProcessor.setSize(700,500);
        textProcessor.setLocationRelativeTo(null);
        textProcessor.setDefaultCloseOperation(EXIT_ON_CLOSE);

        textProcessor.setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        JScrollPane barra = new JScrollPane(areaTexto);

        areaTexto.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void changedUpdate(DocumentEvent e) {
                hayCambios = true;
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                hayCambios = true;
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                hayCambios = true;
            }
            
        });


        JMenuBar menu = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");


        JMenuItem abrir = new JMenuItem("Abrir");
        abrir.addActionListener(a ->{
            JFileChooser fileChooser = new JFileChooser();

            Path directorioRaiz = Paths.get("/media/a25xabierif/a25xabierif_documentos");
            fileChooser.setCurrentDirectory(directorioRaiz.toFile());

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto (.txt)", "txt");
            fileChooser.setFileFilter(filter);

            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int seleccion = fileChooser.showOpenDialog(abrir);
            if(seleccion == JFileChooser.APPROVE_OPTION){

                    File fichero = fileChooser.getSelectedFile();

                    String extension = fichero.getName();

                    if(extension.endsWith(".txt")){
                        try (FileReader file = new FileReader(fichero); BufferedReader buffer = new BufferedReader(file)) {
                            areaTexto.setText("");
                            String line = buffer.readLine();
                            while (line!=null) {
                                areaTexto.append(line+"\n");
                                line = buffer.readLine();
                            }
                            hayCambios = false;
                        } catch (IOException e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(abrir, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);           
                        }
                    }else{
                        JOptionPane.showMessageDialog(abrir, "Elige un archivo .txt");
                    }
            }
        });

        JMenuItem guardar = new JMenuItem("Guardar");
        guardar.addActionListener(a -> {
           JFileChooser fileChooser = new JFileChooser();

            Path directorioRaiz = Paths.get("/media/a25xabierif/a25xabierif_documentos");
            fileChooser.setCurrentDirectory(directorioRaiz.toFile());

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto (.txt)", "txt");
            fileChooser.setFileFilter(filter);

            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int seleccion = fileChooser.showSaveDialog(areaTexto);
            if(seleccion == JFileChooser.APPROVE_OPTION){

                    File fichero = fileChooser.getSelectedFile();
                    Path archivoPath = Paths.get(fichero.getAbsolutePath());

                    if (!archivoPath.toString().toLowerCase().endsWith(".txt")) {
                        archivoPath = Paths.get(archivoPath.toString() + ".txt"); 
                    }

                    try {
                        String textoEscribir = areaTexto.getText();
                        Files.writeString(archivoPath, textoEscribir);
                        hayCambios = false;
                    } catch (IOException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(guardar, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
            }
        });

        JMenuItem salir = new JMenuItem("Salir");
        salir.addActionListener(a -> {

            if(hayCambios){
                int opcion = JOptionPane.showConfirmDialog(salir, 
                "Hay cambios sin guardar. ¿Desea salir de todos modos?", 
                "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if(opcion == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }else{
                System.exit(0);
            }

        });

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
