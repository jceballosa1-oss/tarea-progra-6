package vectores;

import java.util.Scanner;

public class PersonasCorreo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];
        String[] mails = new String[5];

        for (int i = 0; i < 5; i++) {
            nombres[i] = sc.next();
            mails[i] = sc.next();
        }

        // a
        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + " - " + mails[i]);
        }

        // b
        System.out.print("Buscar nombre: ");
        String buscar = sc.next();

        for (int i = 0; i < 5; i++) {
            if (nombres[i].equals(buscar)) {
                System.out.println("Mail: " + mails[i]);
            }
        }

        // c
        for (int i = 0; i < 5; i++) {
            if (!mails[i].contains("@")) {
                System.out.println("Correo inválido: " + mails[i]);
            }
        }
    }
}
