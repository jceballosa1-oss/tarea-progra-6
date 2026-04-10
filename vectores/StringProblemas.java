package vectores;

import java.util.Scanner;

public class StringProblemas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();

        // a
        System.out.println(cad.substring(0, cad.length()/2));

        // b
        System.out.println(cad.charAt(cad.length()-1));

        // c
        for (int i = cad.length()-1; i >= 0; i--)
            System.out.print(cad.charAt(i));
        System.out.println();

        // d
        for (int i = 0; i < cad.length(); i++)
            System.out.print(cad.charAt(i) + "-");
        System.out.println();

        // e
        int vocales = 0;
        for (int i = 0; i < cad.length(); i++) {
            char c = Character.toLowerCase(cad.charAt(i));
            if ("aeiou".indexOf(c) != -1)
                vocales++;
        }
        System.out.println("Vocales: " + vocales);

        // f palíndromo
        String inv = "";
        for (int i = cad.length()-1; i >= 0; i--)
            inv += cad.charAt(i);

        if (cad.equals(inv))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }
}
