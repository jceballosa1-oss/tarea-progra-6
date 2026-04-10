import java.util.Scanner;

public class PruebaVector1 {
    private Scanner teclado;
    private int[] sueldos;

    public void cargar() {
        teclado = new Scanner(System.in);
        sueldos = new int[5];

        for (int f = 0; f < 5; f++) {
            sueldos[f] = teclado.nextInt();
        }
    }

    public void imprimir() {
        for (int f = 0; f < 5; f++) {
            System.out.println(sueldos[f]);
        }
    }

    public static void main(String[] ar) {
        PruebaVector1 v = new PruebaVector1();
        v.cargar();
        v.imprimir();
    }
}