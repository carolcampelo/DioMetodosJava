package Metodos;

import java.util.Scanner;

public class TesteEmprestimo {
    public static void main(String[] args) {
        float valorEmprestimo, quantidadeParcelas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo desejado: R$");
        valorEmprestimo = scanner.nextFloat();

        System.out.println("Digite a quantidade de parcelas:");
        quantidadeParcelas = scanner.nextFloat();

        Emprestimo emprestimo = new Emprestimo(valorEmprestimo, quantidadeParcelas);

        emprestimo.obterInformacoes();
    }
}
