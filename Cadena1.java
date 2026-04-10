import java.util.Scanner;

public class Cadena1 {
    public static void main(String[] ar) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese cadena 1: ");
            String cad1 = teclado.nextLine();

            System.out.print("Ingrese cadena 2: ");
            String cad2 = teclado.nextLine();

            System.out.println("equals: " + cad1.equals(cad2));
            System.out.println("equalsIgnoreCase: " + cad1.equalsIgnoreCase(cad2));
            System.out.println("compareTo: " + cad1.compareTo(cad2));

            System.out.println("Primer caracter: " + cad1.charAt(0));
            System.out.println("Longitud: " + cad1.length());
            System.out.println("Substring: " + cad1.substring(0, 3));
            System.out.println("indexOf: " + cad1.indexOf(cad2));
            System.out.println("Mayúsculas: " + cad1.toUpperCase());
            System.out.println("Minúsculas: " + cad1.toLowerCase());
        }
    }
}