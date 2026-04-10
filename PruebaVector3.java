import java.util.Scanner;

public class PruebaVector3 {
    private Scanner teclado;
    private float[] turnoMan;
    private float[] turnoTar;

    public void cargar() {
        teclado = new Scanner(System.in);

        turnoMan = new float[4];
        turnoTar = new float[4];

        for (int i = 0; i < 4; i++) {
            turnoMan[i] = teclado.nextFloat();
        }

        for (int i = 0; i < 4; i++) {
            turnoTar[i] = teclado.nextFloat();
        }
    }

    public void calcularGastos() {
        float man = 0, tar = 0;

        for (int i = 0; i < 4; i++) {
            man += turnoMan[i];
            tar += turnoTar[i];
        }

        System.out.println("Mañana: " + man);
        System.out.println("Tarde: " + tar);
    }

    public static void main(String[] ar) {
        PruebaVector3 v = new PruebaVector3();
        v.cargar();
        v.calcularGastos();
    }
}