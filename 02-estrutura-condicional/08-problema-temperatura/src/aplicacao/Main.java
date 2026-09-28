package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().toUpperCase().charAt(0);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", celsius);
        } else {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", fahrenheit);
        }

        sc.close();
    }
}
