import java.util.Scanner;
public class exemplo3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("- Calculo da Média -");
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = input.nextFloat();

        float media = (n1 + n2) / 2;
        if (media >= 6) {
            System.out.println("Aprovado!");
            System.out.println("Media: " + media);
        } else {
            System.out.println("Reprovado!");
            System.out.println("Media: " + media);
        }
    }
}
