package vectores;

import java.util.Scanner;

public class Operaciones {
    private int a, b;

    public Operaciones() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public void suma() {
        System.out.println("Suma: " + (a + b));
    }

    public void resta() {
        System.out.println("Resta: " + (a - b));
    }

    public void multiplicacion() {
        System.out.println("Multiplicación: " + (a * b));
    }

    public void division() {
        if (b != 0)
            System.out.println("División: " + (a / b));
    }

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        op.suma();
        op.resta();
        op.multiplicacion();
        op.division();
    }
    
}
