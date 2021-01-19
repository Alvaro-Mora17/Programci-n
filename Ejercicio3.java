import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mon50,mon20,mon10,mon5,mon2,mon1;
        double resultado;
        System.out.print("Cuántas monedas de 50 céntimos ? ");
        mon50 = leer.nextInt();
        System.out.print("Cuántas monedas de 20 céntimos ? ");
        mon20 = leer.nextInt();
        System.out.print("Cuántas monedas de 10 céntimos ? ");
        mon10 = leer.nextInt();
        System.out.print("Cuántas monedas de 5 céntimos ? ");
        mon5 = leer.nextInt();
        System.out.print("Cuántas monedas de 2 céntimos ? ");
        mon2 = leer.nextInt();
        System.out.print("Cuántas monedas de 1 céntimos ? ");
        mon1 = leer.nextInt();
        resultado = (double)mon50 * 0.50 + (double)mon20 * 0.20 + + (double)mon10 * 0.10 + (double)mon5 * 0.05 + (double)mon2 * 0.02 + (double)mon1 * 0.01;
        System.out.print("En total tienes " + resultado + " euros.");
    }
}