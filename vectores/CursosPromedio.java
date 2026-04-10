package vectores;

import java.util.Scanner;

public class CursosPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int sumaA = 0, sumaB = 0;

        System.out.println("Curso A:");
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
            sumaA += A[i];
        }

        System.out.println("Curso B:");
        for (int i = 0; i < 5; i++) {
            B[i] = sc.nextInt();
            sumaB += B[i];
        }

        double promA = sumaA / 5.0;
        double promB = sumaB / 5.0;

        if (promA > promB)
            System.out.println("Curso A tiene mayor promedio");
        else
            System.out.println("Curso B tiene mayor promedio");
    }
}