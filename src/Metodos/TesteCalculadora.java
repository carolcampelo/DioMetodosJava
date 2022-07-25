package Metodos;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DioMetodosJava.Calculadora ===");
        System.out.println("Selecione a opção desejada: \n[1] - Somar \n[2] - Subtrair \n[3] - Multiplicar \n[4] - Dividir \n[5] - Sair");

        double valor1, valor2;
        int opcao = scanner.nextInt();

        while (opcao != 5){
            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    valor2 = scanner.nextDouble();
                    Calculadora.somar(valor1, valor2);
                    break;
                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    valor2 = scanner.nextDouble();
                    Calculadora.subtrair(valor1, valor2);
                    break;
                case 3:
                    System.out.println("Digite o primeiro valor: ");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    valor2 = scanner.nextDouble();
                    Calculadora.multiplicar(valor1, valor2);
                    break;
                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    valor2 = scanner.nextDouble();
                    Calculadora.dividir(valor1, valor2);
                    break;
                default:
                    System.out.println("Selecione a opção desejada: \n[1] - Somar \n[2] - Subtrair \n[3] - Multiplicar \n[4] - Dividir \n[5] - Sair");
                    opcao = scanner.nextInt();
                    break;
            }
        }
        System.out.println("Aplicação Finalizada.");
    }
}