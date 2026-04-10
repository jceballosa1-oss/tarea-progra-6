package vectores;

import java.util.Scanner;

public class MatrizColumnas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[2][5];

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.print("Ingrese valor: ");
                mat[f][c] = sc.nextInt();
            }
        }

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(mat[f][c] + " ");
            }
            System.out.println();
        }
    }
}