package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Segundo valor: ");
        int b = sc.nextInt();

        System.out.print("Terceiro valor: ");
        int c = sc.nextInt();

        int menor;

        if (a <= b && a <= c) {
            menor = a;
        } else if (b <= c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("MENOR = " + menor);

        sc.close();
    }
}
