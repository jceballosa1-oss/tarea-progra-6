package vectores;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Sueldo: ");
        sueldo = sc.nextDouble();
    }

    public void imprimir() {
        System.out.println(nombre + " - " + sueldo);
    }

    public void impuestos() {
        if (sueldo > 3000)
            System.out.println("Debe pagar impuestos");
        else
            System.out.println("No paga impuestos");
    }

    public static void main(String[] args) {
        Empleado e = new Empleado();
        e.imprimir();
        e.impuestos();
    }
}
    

