import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        boolean seguir = true;

        while(seguir){
            System.out.println("Elija una opción: ");
            System.out.println("1 - Ventana básica");
            System.out.println("2 - Ventana con múltiples botones");
            System.out.println("3 - Interfaz con campos de texto");
            System.out.println("4 - Uso de etiquetas y campos de texto");
            System.out.println("5 - Uso de cuadros de diálogo");
            System.out.println("6 - Menú desplegable");
            System.out.println("7 - Campo de contraseña");
            System.out.println("8 - Radio Buttons");
            System.out.println("9 - Checkbox");
            System.out.println("10 - Menú de barra");
            System.out.println("Salir.");

            int valor = entrada.nextInt();

            if(valor>0 && valor<12){
                switch (valor) {
                    case 1:
                        Ex1 proba = new Ex1("Exercicio1");
                        proba.añadirBoton("Cousa");
                    break;

                    case 2:
                        Ex2 proba2 = new Ex2("Exercicio2");
                        proba2.añadirBoton("Aceptar","Aceptado");
                        proba2.añadirBoton("Cancelar","Cancelado");
                    break;
                    
                    case 3:
                        Ex3 proba3 = new Ex3("Exercicio3");

                    break;

                    case 4:
                        Ex4 proba4 = new Ex4("Exercicio4");
                    break;

                    case 5:
                        Ex5 proba5 = new Ex5("Exercicio5");
                    break;

                    case 6:
                        Ex6 proba6 = new Ex6("Exercicio6");
                    break;

                    case 7:
                        Ex7 proba7 = new Ex7("Exercicio7");
                    break;

                    case 8:
                        
                    break;
                }
            }else{
                System.out.println("Introduce un número válido");
            }
        }
    }
}
