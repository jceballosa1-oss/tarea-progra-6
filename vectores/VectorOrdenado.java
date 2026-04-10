package vectores;

import java.util.Scanner;

public class VectorOrdenado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        boolean ordenado = true;

        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (v[i] > v[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado)
            System.out.println("Está ordenado");
        else
            System.out.println("No está ordenado");
    }
}
