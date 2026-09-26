package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a duração em segundos: ");
        int duracao = sc.nextInt();

        int horas = duracao / 3600;
        int resto = duracao % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
