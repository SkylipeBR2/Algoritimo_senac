import java.util.Scanner;

public class exemplo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float p1 = 0.5f, p2 = 0.3f, p3 = 0.2f;
        System.out.println("- Calculo da Média -");
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = input.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = input.nextFloat();


        System.out.println(" *- Agora vamos digitar as faltas! -* ");
        System.out.println("Quantas faltas: ");
        float faltas = input.nextFloat();


        float media = ((n1 * p1) + (n2 * p2) + (n3 * p3));
        if (media >= 6 && faltas <= 18) {
            System.out.println("Aprovado!");
            System.out.println("Media: " + media + " com o total de " + faltas + " faltas");
        } else if (media <= 6){
            System.out.println("Reprovado por média!");
            System.out.println("Media: " + media);
        } else {
            System.out.println("Reprovado por faltas");
            System.out.println("Faltas: " + faltas);
        }
    }
}
