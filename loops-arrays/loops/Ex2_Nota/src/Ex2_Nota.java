/* Criar um programa para pedir uma nota entre zero e dez [0-10]
Mostrar uma mensagem caso o valor seja inválido e continuar pedindo até
que o usuário informe um valor válido.*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite novamente.");
            nota = scan.nextInt();
        }
    }
}