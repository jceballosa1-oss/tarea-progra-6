import java.util.Scanner;

public class Matriz2 {
    private Scanner teclado;
    private int[][] mat;

    public void cargar() {
        teclado = new Scanner(System.in);
        mat = new int[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimirDiagonal() {
        for (int k = 0; k < 4; k++) {
            System.out.print(mat[k][k] + " ");
        }
    }

    public static void main(String[] ar) {
        Matriz2 m = new Matriz2();
        m.cargar();
        m.imprimirDiagonal();
    }
}