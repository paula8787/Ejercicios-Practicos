import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        for (int i = 1; i < 100; i++) {
            if (i / 2 == 0) {
                contador++;
            }
        }
        System.out.println("hay "+ contador + "numeros pares entre 1 y 100");
        
        scanner.close();
    }
}
