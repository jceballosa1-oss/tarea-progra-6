package vectores;

import java.util.Scanner;

public class VectorProblema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vec = new int[8];

        int sumaTotal = 0;
        int sumaMayor36 = 0;
        int cantMayor50 = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese valor: ");
            vec[i] = sc.nextInt();

            sumaTotal += vec[i];

            if (vec[i] > 36) {
                sumaMayor36 += vec[i];
            }

            if (vec[i] > 50) {
                cantMayor50++;
            }
        }

        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma mayores a 36: " + sumaMayor36);
        System.out.println("Cantidad mayores a 50: " + cantMayor50);
    }
}