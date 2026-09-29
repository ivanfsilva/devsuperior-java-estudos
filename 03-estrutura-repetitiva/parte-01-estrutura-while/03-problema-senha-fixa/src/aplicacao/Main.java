package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        // Repete o laço enquanto a senha digitada for diferente de 2002
        while (senha != 2002) {
            System.out.print("Senha Invalida! Tente novamente: ");
            senha = sc.nextInt();
        }

        // Quando o laço encerra, significa que a senha digitada foi 2002
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
