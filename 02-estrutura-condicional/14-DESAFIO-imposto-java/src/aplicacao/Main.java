package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Renda anual com salário: ");
        double rendaSalario = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServicos = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double rendaCapital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacao = sc.nextDouble();

        // 1) Imposto sobre salário
        double salarioMensal = rendaSalario / 12.0;
        double impostoSalario;

        if (salarioMensal < 3000.0) {
            impostoSalario = 0.0;
        } else if (salarioMensal < 5000.0) {
            impostoSalario = rendaSalario * 0.10;
        } else {
            impostoSalario = rendaSalario * 0.20;
        }

        // 2) Imposto sobre serviços
        double impostoServicos = rendaServicos * 0.15;

        // 3) Imposto sobre ganho de capital
        double impostoCapital = rendaCapital * 0.20;

        // Imposto bruto
        double impostoBruto = impostoSalario + impostoServicos + impostoCapital;

        // 4) Abatimento / Deduções
        double limiteAbatimento = impostoBruto * 0.30;
        double gastosTotais = gastosMedicos + gastosEducacao;
        double abatimento;

        if (gastosTotais > limiteAbatimento) {
            abatimento = limiteAbatimento;
        } else {
            abatimento = gastosTotais;
        }

        double impostoDevido = impostoBruto - abatimento;

        // Relatório formatado
        System.out.println();
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", limiteAbatimento);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosTotais);
        System.out.println();
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
        System.out.printf("Abatimento: %.2f%n", abatimento);
        System.out.printf("Imposto devido: %.2f%n", impostoDevido);

        sc.close();
    }
}
