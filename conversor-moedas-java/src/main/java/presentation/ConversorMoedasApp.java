package presentation;

import service.ConversorMoedasService;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Camada de apresentação: interação com o usuário via console.
 */
public class ConversorMoedasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoedasService service = new ConversorMoedasService();

        String[][] opcoes = {
            {"USD", "BRL", "Dólar para Real"},
            {"EUR", "BRL", "Euro para Real"},
            {"BRL", "USD", "Real para Dólar"},
            {"BRL", "EUR", "Real para Euro"},
            {"USD", "EUR", "Dólar para Euro"},
            {"EUR", "USD", "Euro para Dólar"}
        };

        while (true) {
            System.out.println("=== Conversor de Moedas ===");
            for (int i = 0; i < opcoes.length; i++) {
                System.out.printf("%d - %s\n", i + 1, opcoes[i][2]);
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int escolha;
            try {
                escolha = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.next(); // Limpa o buffer
                continue;
            }

            if (escolha == 0) break;
            if (escolha < 1 || escolha > opcoes.length) {
                System.out.println("Opção inválida.");
                continue;
            }

            System.out.print("Digite o valor a converter: ");
            double valor;
            try {
                valor = scanner.nextDouble();
                if (valor < 0) throw new IllegalArgumentException();
            } catch (Exception e) {
                System.out.println("Valor inválido.");
                scanner.next();
                continue;
            }

            String moedaOrigem = opcoes[escolha - 1][0];
            String moedaDestino = opcoes[escolha - 1][1];

            try {
                double convertido = service.converterMoeda(valor, moedaOrigem, moedaDestino);
                System.out.printf("Resultado: %.2f %s = %.2f %s\n", valor, moedaOrigem, convertido, moedaDestino);
            } catch (Exception e) {
                System.out.println("Erro na conversão: " + e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}