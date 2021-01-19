import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.print("Como se llama ? ");
        nombre = leer.nextLine();
        System.out.print("Hola, " + nombre + ".");
    }
}