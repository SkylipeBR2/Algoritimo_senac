import java.util.Scanner;

public class paresArray {

    public static int tamanho() {
        System.out.println("Tamanho do vetor");
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int tamanho = input.nextInt();
        return tamanho;
    }

    public static int[] criarVetor(int tamanho) {
        System.out.println("Criar vetor");
        int[] vetor = new int[tamanho];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: \n", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    public static void pares(int [] vetor, int tamanho){
            for(int i = 0; i < vetor.length; i++){
                if (vetor[i] % 2 == 0){
                    System.out.printf("Número par: %d \n", vetor[i]);
                }
            }
        }

    public static void impar(int [] vetor, int tamanho){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 != 0){
                System.out.printf("Número impar: %d \n", vetor[i]);
            }
        }
    }


    public static void main(String[] args) {
        int t = tamanho();
        int[] v = criarVetor(t);
        pares(v, t);
        impar(v, t);
    }
}
