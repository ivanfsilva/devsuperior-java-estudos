package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = null;
        int option = 0;

        do {
            System.out.println("\n--- MENU DE ESTOQUE ---");
            System.out.println("1 - Estoque inicial");
            System.out.println("2 - Entrada no estoque");
            System.out.println("3 - Saída no estoque");
            System.out.println("9 - Saída do programa");
            System.out.print("Escolha uma opção: ");

            option = sc.nextInt();
            sc.nextLine(); // Consome o \n retido após ler o inteiro

            switch (option) {
                case 1 -> {
                    product = new Product();
                    System.out.println("\nDigite os dados do produto:");
                    System.out.print("Nome: ");
                    product.name = sc.nextLine();

                    System.out.print("Preço: ");
                    product.price = sc.nextDouble();

                    System.out.print("Quantidade inicial em estoque: ");
                    product.quantity = sc.nextInt();

                    System.out.println("\nDados do produto: " + product);
                }
                case 2 -> {
                    if (product == null) {
                        System.out.println("\n[Aviso] Cadastre primeiro o estoque inicial (Opção 1)!");
                    } else {
                        System.out.print("\nDigite a quantidade de produtos a ser adicionada ao estoque: ");
                        int quantity = sc.nextInt();
                        product.addProducts(quantity);
                        System.out.println("\nDados atualizados: " + product);
                    }
                }
                case 3 -> {
                    if (product == null) {
                        System.out.println("\n[Aviso] Cadastre primeiro o estoque inicial (Opção 1)!");
                    } else {
                        System.out.print("\nDigite a quantidade de produtos a ser removida do estoque: ");
                        int quantity = sc.nextInt();
                        product.removeProducts(quantity);
                        System.out.println("\nDados atualizados: " + product);
                    }
                }
                case 9 -> System.out.println("\nEncerrando o programa...");
                default -> System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (option != 9);

        sc.close();
    }
}