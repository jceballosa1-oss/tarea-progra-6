import java.util.Scanner;

public class PruebaVector2 {
    private Scanner teclado;
    private float[] alturas;
    private float promedio;

    public void cargar() {
        teclado = new Scanner(System.in);
        alturas = new float[5];

        for (int i = 0; i < 5; i++) {
            alturas[i] = teclado.nextFloat();
        }
    }

    public void calcularPromedio() {
        float suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += alturas[i];
        }
        promedio = suma / 5;
        System.out.println("Promedio: " + promedio);
    }

    public void mayoresMenores() {
        int may = 0, men = 0;

        for (int i = 0; i < 5; i++) {
            if (alturas[i] > promedio) may++;
            else if (alturas[i] < promedio) men++;
        }

        System.out.println("Mayores: " + may);
        System.out.println("Menores: " + men);
    }

    public static void main(String[] ar) {
        PruebaVector2 v = new PruebaVector2();
        v.cargar();
        v.calcularPromedio();
        v.mayoresMenores();
    }
}