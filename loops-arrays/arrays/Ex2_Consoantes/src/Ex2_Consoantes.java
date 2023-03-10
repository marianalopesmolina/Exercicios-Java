/* Criar um programa que leia um vetor de 6 caracteres.
Exibir quantas consoantes foram lidas.
Imprimir as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtd = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                   letra.equalsIgnoreCase("e") |
                   letra.equalsIgnoreCase("i") |
                   letra.equalsIgnoreCase("o") |
                   letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;
                qtd++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante : consoantes ) {
            if (consoante != null)
            System.out.print(consoante + " ");
        }

        System.out.println("Quantidade consoantes: " + qtd);
        System.out.println("Quantidade de elementos no vetor: " + consoantes.length);

    }
}