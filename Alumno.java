import java.util.Scanner;

public class Alumno {
    private Scanner teclado;
    private String nombre;
    private int edad;

    public Alumno() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese edad: ");
        edad = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " no es mayor de edad");
        }
    }

    public static void main(String[] ar) {
        Alumno a = new Alumno();
        a.imprimir();
        a.esMayorEdad();
    }
}