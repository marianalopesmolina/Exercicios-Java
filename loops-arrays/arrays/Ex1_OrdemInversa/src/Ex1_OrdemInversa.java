/* Criar um vetor de 6 números inteiros.
* Exibi-los na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {

        int[] vetor = {0, -5, 15, 50, 8, 4};

        //System.out.println(vetor.length);

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        int i;
        for(i = (vetor.length -1); i >= 0; i--) {;
            System.out.print(vetor[i] + " ");
        }
    }
}