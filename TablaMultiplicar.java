public class TablaMultiplicar {
    private int tabla;
    private int terminos;

    public TablaMultiplicar(int ta, int ter) {
        tabla = ta;
        terminos = ter;
    }

    public TablaMultiplicar(int ta) {
        tabla = ta;
        terminos = 10;
    }

    public void imprimir() {
        for (int f = 1; f <= terminos; f++) {
            System.out.println(tabla + " * " + f + " = " + (tabla * f));
        }
    }

    public static void main(String[] ar) {
        TablaMultiplicar t1 = new TablaMultiplicar(5);
        t1.imprimir();

        TablaMultiplicar t2 = new TablaMultiplicar(3, 5);
        t2.imprimir();
    }
}