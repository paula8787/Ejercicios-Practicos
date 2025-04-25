import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("ingrese el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("Suma"+ suma);
        System.out.println("resta"+ resta);
        System.out.println("multiplicacion"+ multiplicacion);
        System.out.println("division"+ division);
        System.out.println("modulo"+ modulo);

        scanner.close();
    }
}
