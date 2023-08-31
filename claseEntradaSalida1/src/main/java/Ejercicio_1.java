import java.util.Scanner;
import static javax.swing.JOptionPane.*;

public class Ejercicio_1 {

    public static void main(String[] args) {
        String nombre, apellido;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellio");
        apellido = sc.nextLine();
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        System.out.println("Nombre completo: " + nombre + " " + apellido + "Edad: "+ edad);
        sc.close();

        nombre =  showInputDialog("Ingrese un nombre:");
        apellido = showInputDialog("Ingrese un apellido:");
        showMessageDialog(null, "Nombre completo: " + nombre + " " + apellido);
    }
}
