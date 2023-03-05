/* Criar um programa que leia 20 números inteiros aleatórios entre 0 e 100 e
armazene-os em um vetor.
Ao final, mostrar os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAle = new int[20];

        for (int i = 0; i < numAle.length; i++) {
            int numero = random.nextInt(100);
            numAle[i] = numero;
        }

        System.out.print("\nNúmeros aleatórios: ");
        for (int numero : numAle) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numAle) {
            System.out.print((numero+1) + " ");
        }
    }
}