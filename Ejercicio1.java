import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double tirada = Math.round(Math.random()*6),tirada2 = Math.round(Math.random()*6);
        double sumatorio = tirada + tirada2;
        System.out.println("El primer dado saca un " + (int)tirada );
        System.out.println("El segundo dado saca " + (int)tirada2 );
        System.out.println("Tu tirada suma " + (int)sumatorio);
        System.out.print("Valore del 1 al 10 la utilidad de este ejercicio: ");
        int valor = leer.nextInt();
        System.out.println("Valor insertado " + valor);
    }
}