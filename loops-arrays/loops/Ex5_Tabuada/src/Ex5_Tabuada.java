/* Desenvolver um gerador de tabuada capaz de gerar
a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar qual o número desejado.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor desejado para a tabuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de: " + numero);

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}