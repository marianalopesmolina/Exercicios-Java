/* Criar um programa que peça N números inteiros.
Calcular e mostrar a quantidade de números pares e
a quantidade de números ímpares. */

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int pares = 0, impares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares++;
            else impares++;

            count++;

        } while(count < quantNumeros);

        System.out.println("Qtd. Pares: " + pares);
        System.out.println("Qtd. Ímpares: " + impares);

    }
}