import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int edad = 19;
        double altura = 1.72;
        char InicialNombre = 'P';
        boolean MayorDeEdad = edad >=18;

        System.out.println("edad"+ edad);
        System.out.println("altura"+ altura);
        System.out.println("Inicial del Nombre"+ InicialNombre);
        System.out.println("es mayor de edad"+ MayorDeEdad);

        input.close();
    }
}
