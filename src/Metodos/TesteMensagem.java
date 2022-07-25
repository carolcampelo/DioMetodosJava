package Metodos;

import java.util.Scanner;

public class TesteMensagem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o horário do dia: ");
        int horario = scanner.nextInt();

        Mensagem mensagem = new Mensagem(horario);

        mensagem.obterMensagem();
    }
}
