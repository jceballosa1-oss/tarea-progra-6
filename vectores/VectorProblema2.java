package vectores;

import java.util.Scanner;

public class VectorProblema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[4];
        int[] v2 = new int[4];
        int[] v3 = new int[4];

        System.out.println("Vector 1:");
        for (int i = 0; i < 4; i++) {
            v1[i] = sc.nextInt();
        }

        System.out.println("Vector 2:");
        for (int i = 0; i < 4; i++) {
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            v3[i] = v1[i] + v2[i];
        }

        System.out.println("Vector suma:");
        for (int i = 0; i < 4; i++) {
            System.out.println(v3[i]);
        }
    }
}