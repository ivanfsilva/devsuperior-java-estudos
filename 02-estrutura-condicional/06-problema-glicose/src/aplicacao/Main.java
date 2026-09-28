package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        if (glicose <= 100.0) {
            System.out.println("Classificacao: normal");
        } else if (glicose <= 140.0) {
            System.out.println("Classificacao: elevado");
        } else {
            System.out.println("Classificacao: diabetes");
        }

        sc.close();
    }
}
