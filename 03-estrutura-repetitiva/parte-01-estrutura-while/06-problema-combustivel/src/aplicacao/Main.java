package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        int codigo = sc.nextInt();

        // O laço continua até que o código informado seja 4
        while (codigo != 4) {
            switch (codigo) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
                // Códigos fora do intervalo 1 a 4 são ignorados nos contadores
                default -> { }
            }

            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();
        }

        // Exibição dos resultados
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
